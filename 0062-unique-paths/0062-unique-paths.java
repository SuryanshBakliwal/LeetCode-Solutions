class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        int ans = uniquePathsHelper(m-1,n-1, dp);
        return ans;
    }
    
    public int uniquePathsHelper(int m, int n, int [][] dp) {
        if(m<0 || n<0) return 0;
        else if(m==0 && n==0) return 1;
        else if(dp[m][n] > 0) return dp[m][n];
        else{
            dp[m][n] = uniquePathsHelper(m - 1, n, dp) + uniquePathsHelper(m, n - 1, dp);
            return dp[m][n];
        }
    }
        
}