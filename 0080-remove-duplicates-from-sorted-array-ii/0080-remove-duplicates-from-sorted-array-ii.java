class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int k=1;
        for(int i=1; i<nums.length; i++){
            if(k == 1 || nums[k-2] != nums[i]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}