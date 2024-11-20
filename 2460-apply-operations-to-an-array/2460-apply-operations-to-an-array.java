class Solution {
    public int[] applyOperations(int[] nums) {
        int snowball = 0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                nums[i] *= 2; nums[i+1]=0;
            }
            if(nums[i] == 0){
                snowball++;
            }
            else if(snowball > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-snowball] = temp;
            }
        }
        return nums;
    }
}