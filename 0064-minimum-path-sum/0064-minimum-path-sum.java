class Solution {
    public int minPathSum(int[][] grid) {
        int trow = grid.length, tcol = grid[0].length;
        int dp[][] = new int[trow][tcol];
        // dp[0][0] = grid[0][0];
        for(int i=0; i<trow; i++){
            for(int j=0; j<tcol; j++){
                
                if(i-1>=0 && j-1>=0){
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
                    
                }else if(i-1>=0 && j-1<0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else if(i-1<0 && j-1>=0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else{
                    dp[i][j] = grid[i][j];
                }
                
                
                
                if(i<trow && j<tcol ){
                }
            }
        }
        return dp[trow-1][tcol-1];
    }
}