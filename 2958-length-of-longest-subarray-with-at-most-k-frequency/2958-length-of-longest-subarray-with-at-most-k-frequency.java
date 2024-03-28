class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans=0, j=0;
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
            while(freq.get(nums[i])>k){
                freq.put(nums[j], freq.get(nums[j++])-1);
            }
            ans = Math.max(ans,i-j+1);
            
        }
        return ans;
    }
}