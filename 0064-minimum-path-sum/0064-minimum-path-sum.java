class Solution {
    public int minPathSum(int[][] grid) {
        int trow = grid.length, tcol = grid[0].length;
        // int dp[][] = new int[trow][tcol];
        for(int i=0; i<trow; i++){
            for(int j=0; j<tcol; j++){
                
                if(i-1>=0 && j-1>=0){
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                    
                }else if(i-1>=0 && j-1<0){
                    grid[i][j] += grid[i-1][j];
                }else if(i-1<0 && j-1>=0){
                    grid[i][j] += grid[i][j-1];
                }
            }
        }
        return grid[trow-1][tcol-1];
    }
}