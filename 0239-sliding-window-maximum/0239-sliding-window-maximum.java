class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums, k, list);
        int res[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    
    private void helper(int nums[], int k, ArrayList<Integer> list){
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            while(st.size()>0 && nums[st.peek()] <= nums[i]) st.pop();
            if(st.size() == 0) nge[i] = nums.length;
            else nge[i] = st.peek();
            st.push(i);
        }
        
        for(int i=0,j=0; i<=nums.length-k; i++){
            if(i > j) j = i;
            while(nge[j] < i+k) j = nge[j];
            list.add(nums[j]);
        }
    }
}