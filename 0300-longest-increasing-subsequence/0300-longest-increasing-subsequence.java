class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int []dp = new int[n];
        int omax=0;
        for(int i=0; i<n; i++){
            int max=0;
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    if(dp[j]>max) max=dp[j];
                }
            }
            dp[i] = max+1;
            omax = dp[i] > omax ? dp[i] : omax;
        }
        return omax;
    }
}