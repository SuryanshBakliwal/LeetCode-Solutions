class Solution {
    public int maxSubArray(int[] nums) {
        //Brute Force : TC = O(n^2) || SC = o(1)
        // Kadane's Algo : TC = O(n) || SC = o(1)
        
        int max_sum = nums[0];
        int cur_sum = 0;
        
        for(int num : nums){
            cur_sum = Math.max(cur_sum, 0);
            cur_sum += num;
            max_sum = Math.max(max_sum, cur_sum);
        }
        
        return max_sum;
    }
}