class Solution {

    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        int ans = 0;
        long min = Integer.MAX_VALUE;
        long leftsum = 0, rightsum = 0;
        long sum=0;
        for(int i : nums){
            sum += i;
        }
        for(int i=0; i<n; i++){
            int l = i+1;
            int r = n - l;
            leftsum += nums[i];
            rightsum = sum - leftsum;
            long x = leftsum / l;
            long y = (i == n-1) ? 0: rightsum/r ;
            long currMin = Math.abs(x - y);
            if(min>currMin){
                min = currMin;
                ans = i;
            }
        }
        
        return ans;
    }
}