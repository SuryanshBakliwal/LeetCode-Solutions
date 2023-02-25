class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // first calculate nge for every elem of nums2;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(st.size() > 0 && st.peek() <= nums2[i]) 
                st.pop();
            if(st.size() == 0)
                map.put(nums2[i], -1);
            
            else map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }
        int res[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            int x = nums1[i];
            res[i] = map.get(x);
        }
        
        return res;
        
    }
}