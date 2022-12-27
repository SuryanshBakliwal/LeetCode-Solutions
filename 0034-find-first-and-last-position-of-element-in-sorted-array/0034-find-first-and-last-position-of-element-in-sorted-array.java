class Solution {
    public int[] searchRange(int[] nums, int d) {
        int n = nums.length;
        int l=0;
        int h=n-1;
        int first = -1, last = -1, mid= -1;
        while(l<=h){
            mid = (h+l)/2;
            if(nums[mid] > d){
                h = mid-1;
            }else if(nums[mid] < d){
                l = mid+1;
            }else{
                last = mid;
                l = mid+1;
            }
        }

        l=0;
        h=n-1;
        while(l<=h){
            mid = (h+l)/2;
            if(nums[mid] > d){
                h = mid-1;
            }else if(nums[mid] < d){
                l = mid+1;
            }else{
                first = mid;
                h = mid-1;
            }
        }
        
        int arr[] = new int[2];
        arr[0] = first;
        arr[1] = last;
        return arr;
    }
}