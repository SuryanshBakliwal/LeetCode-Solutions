class Solution {
    public int[] mergeTwoArray(int[] nums1, int[] nums2){
        int i=0, j=0, k=0;
        int arr[] = new int[nums1.length + nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }
            else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] res = mergeTwoArray(nums1, nums2);
        double median=0;
        if((res.length)%2==0){
            int i = (res.length)/2;
            median = (res[i] + res[i-1])/2.0;
        }else{
            int i = (res.length)/2;
            median = res[i];
        }
        
        return median;
    }
}