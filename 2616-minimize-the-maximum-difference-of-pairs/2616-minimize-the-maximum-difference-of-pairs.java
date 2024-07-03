class Solution {
    
    boolean solve(int nums[], int p, int mid){
        for(int i=1; i<nums.length; i++){
            if( (nums[i] - nums[i-1]) <= mid ){
                i++; p--;
            }
        }
        if(p <= 0){
            return true;
        }
        return false;
    }
    
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int l = 0, r = nums[nums.length-1];
        int ans = Integer.MAX_VALUE;
        while(l <= r){
            int mid = (l+r)/2;
            boolean flag = solve(nums, p, mid);
            if(flag){
                ans = mid;
                r=mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}