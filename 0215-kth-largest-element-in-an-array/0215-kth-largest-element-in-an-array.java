class Solution {
    public int partition(int [] arr, int pivot, int lo, int hi){
        int i = lo, j = lo;
        while(i <= hi){
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j-1;
    }
    
    public int quickSelect(int []nums, int lo, int hi, int k){
        int pivot = nums[hi];
        int pi = partition(nums, pivot, lo, hi);
        if(pi < k){
            return quickSelect(nums, pi + 1, hi, k);
        }else if(pi > k){
            return quickSelect(nums, lo, pi - 1, k);
        }else {
            return nums[pi];
        }
    } 
    public int findKthLargest(int[] nums, int k) {
        int ans = quickSelect(nums, 0, nums.length-1, nums.length - k);
        return ans;
    }
}