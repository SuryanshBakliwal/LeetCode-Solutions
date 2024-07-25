class Solution {
    
    public int[] mergeSort(int[] nums, int i, int j){
        if(i==j){
            int arr[] = new int[1];
            arr[0] = nums[i];
            return arr;
        }
        int mid = (i+j)/2;
        int arr1[] = mergeSort(nums, i, mid);
        int arr2[] = mergeSort(nums, mid+1, j);
        return mergeTwoArray(arr1, arr2);
        // return res;
    }
    
    public int[] mergeTwoArray(int[] arr1, int[] arr2){
        int i=0, j=0, k=0;
        int res[] = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                res[k++] = arr1[i++];
            }else{
                res[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            res[k++] = arr1[i++];
        }
        while(j < arr2.length){
            res[k++] = arr2[j++];
        }
        return res;
    }
    
    
    
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}