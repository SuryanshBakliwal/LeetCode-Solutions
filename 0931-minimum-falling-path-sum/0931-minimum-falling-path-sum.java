class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n=arr.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++) dp[0][i]=arr[0][i];
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int min = Integer.MAX_VALUE;
                min = Math.min(dp[i-1][j], min);
                if(j-1>=0) min = Math.min(dp[i-1][j-1], min);
                if(j+1<n) min = Math.min(dp[i-1][j+1], min);
                dp[i][j] = min + arr[i][j];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, dp[n-1][i]);
        }
        return ans;
    }
}