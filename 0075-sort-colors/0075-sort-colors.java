class Solution {
    public void sortColors(int[] nums) {
        int l = 0, mid = 0, hi = nums.length-1;
        while(mid<=hi){
            if(nums[mid] == 0){
                int temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                mid++;
                l++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[hi];
                nums[hi] = nums[mid];
                nums[mid] = temp;
                hi--;
            }
        }
    }
}