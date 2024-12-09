class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i-1][j-1];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int r1=0; r1<m; r1++){
            for(int c1=0; c1<n; c1++){
                for(int r2=r1; r2<m; r2++){
                    for(int c2=c1; c2<n; c2++){
                        int area = dp[r2+1][c2+1] - dp[r1][c2+1] - dp[r2+1][c1] + dp[r1][c1]; 
                        if(area <= k) max = Math.max(area, max);
                    }
                }
            }
        }
        return max;
    }
}