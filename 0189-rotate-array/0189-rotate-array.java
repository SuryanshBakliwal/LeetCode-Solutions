class Solution {
    void reverse(int[] arr, int l, int r){
        while(l <= r){
            int temp = arr[l]; 
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        if(k>=n)k = k%(n+1);
        reverse(nums, 0, n-k);
        reverse(nums, n-k+1, n);
        reverse(nums, 0, n);
    }
}