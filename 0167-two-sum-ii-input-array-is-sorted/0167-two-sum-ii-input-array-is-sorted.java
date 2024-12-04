class Solution {
    public int[] twoSum(int[] nums, int target) {
        int L=1, R=nums.length;
        while(L < R){
            if(nums[L-1] + nums[R-1] > target){
                R--;
            }else if(nums[L-1] + nums[R-1] < target){
                L++;
            }else{
                break;
            }
        }
        return new int[]{L,R};
    }
}