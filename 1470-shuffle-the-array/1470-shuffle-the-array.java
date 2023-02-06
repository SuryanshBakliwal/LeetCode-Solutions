class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n == 1) return nums;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int j=0, k=0;
        for(int i=0; i<nums.length; i++){
            if(i < n){
                arr1[j++] = nums[i];
            }
            else arr2[k++] = nums[i];
        }
        j=0; k=0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = arr1[j++];
            }
            else nums[i] = arr2[k++];
        }
        
        return nums;
    }
}