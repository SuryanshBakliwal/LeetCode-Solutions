class Solution {
    int area=0;
    public int maximalRectangle(char[][] matrix) {
        
        int rows = matrix.length, cols = matrix[0].length;
        int heights[] = new int[cols];
        
        for(int i=0; i<cols; i++){
            if(matrix[0][i] == '1') heights[i]=1;
            else heights[i] = 0;
        }
        
        int ans = largestRectangleArea(heights);
        for(int i=1; i<rows; i++){
            resetHeights(heights, matrix, i);
            ans = Math.max(ans, largestRectangleArea(heights));
        }
        return ans;
    }
    
    public void resetHeights(int[] heights, char[][] matrix, int i){
        for(int j=0; j<heights.length; j++){
            if(matrix[i][j] == '1') heights[j] += 1;
            else heights[j] = 0;
        }
    }
    
    
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