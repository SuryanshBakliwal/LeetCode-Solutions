class Solution {
    public int largestRectangleArea(int[] heights) {
        
        // FOR LEFT BOUNDARY
        int lb[] = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(st.size() > 0 && heights[i]<=heights[st.peek()]) st.pop(); 
            if(st.size() == 0) lb[i] = -1;
            else{
                lb[i] = st.peek();
            }
            st.push(i);
        }
        // FOR RIGHT BOUNDARY
        int rb[] = new int[heights.length];
        st = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(st.size() > 0 && heights[i]<=heights[st.peek()]) st.pop(); 
            if(st.size() == 0) rb[i] = heights.length;
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        // Area
        int maxArea=0;
        for(int i=0; i<heights.length; i++){
            int width = rb[i] - lb[i] - 1;
            int area = width*heights[i];
            maxArea = Math.max(area, maxArea);
        }
        
        return maxArea;
    }
}