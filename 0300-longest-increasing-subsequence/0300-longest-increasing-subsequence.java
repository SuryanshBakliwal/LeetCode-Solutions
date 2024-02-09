class Solution {
    public int help(int idx, int prev, int dp[][], int arr[]){
        if(idx == arr.length) return 0;
        if(dp[idx][prev+1] != 0) return dp[idx][prev+1];
        int len = help(idx+1, prev, dp, arr);
        if(prev == -1 || arr[idx] > arr[prev]){
            len = Math.max(len, 1 + help(idx+1, idx, dp, arr));
        }
        return dp[idx][prev+1] = len;
        
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][n+1];
        return help(0, -1, dp, nums);
    }
}