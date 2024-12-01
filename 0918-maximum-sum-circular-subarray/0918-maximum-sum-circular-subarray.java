class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int minSum = nums[0], maxSum = nums[0];
        int currMax=0, currMin=0;
        for(int a : nums){
            currMax = Math.max(currMax + a, a);
            maxSum = Math.max(currMax, maxSum);
            currMin = Math.min(currMin + a, a);
            minSum = Math.min(currMin, minSum);
            total += a;
        }
        return maxSum > 0 ? Math.max(total - minSum, maxSum) : maxSum;
    }
}