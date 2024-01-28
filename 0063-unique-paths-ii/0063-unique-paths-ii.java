class Solution {
    
    int help(int[][] oGrid, int[][] dp, int m, int n){
        if(m<0 || n<0 || oGrid[m][n] == 1){
            return 0;
        }
        else if(m==0 && n==0){
            return 1;
        } else if(dp[m][n] > 0) return dp[m][n];
        else{
            dp[m][n] = help(oGrid, dp, m-1, n) + help(oGrid, dp, m, n-1);
            return dp[m][n];
        }
    }
    
    public int uniquePathsWithObstacles(int[][] oGrid) {
        int m=oGrid.length, n=oGrid[0].length;
        int dp[][] = new int[m][n];
        int ans = help(oGrid, dp, m-1, n-1);
        return ans;
    }
}