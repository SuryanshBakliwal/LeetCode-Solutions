class Solution {
    public int help(int trow, int tcol, int r, int c1, int c2, Integer[][][] dp, int[][] grid){
        if(r==trow){
            return 0;
        }
        if(dp[r][c1][c2] != null) return dp[r][c1][c2];
        int ans=0;
        for(int i=-1; i<=1; i++){
            for(int j=-1; j<=1; j++){
                if(c1+i >= 0 && c1+i < tcol &&  c2+j>=0 && c2+j < tcol)
                    ans = Math.max(ans, help(trow, tcol, r+1, c1+i, c2+j, dp, grid));
            }
        }
        return dp[r][c1][c2] = c1==c2 ? grid[r][c1] + ans : grid[r][c2] + ans + grid[r][c1];
    }
    public int cherryPickup(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Integer dp[][][] = new Integer[row][col][col];
        return  help(row, col, 0, 0, col-1,dp, grid);
    }
}