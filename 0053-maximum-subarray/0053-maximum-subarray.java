class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, bestSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < ( nums[i] + currSum )){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            bestSum = Math.max(currSum, bestSum);
        }
        return bestSum;
    }
}