class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, sum=0;
        int lenOfSubArray = nums.length + 1;
        for(int r=0; r<nums.length; r++){
            sum += nums[r];
            while(sum >= target){
                lenOfSubArray = Math.min(lenOfSubArray, r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return lenOfSubArray == nums.length + 1 ? 0 : lenOfSubArray;
    }
}