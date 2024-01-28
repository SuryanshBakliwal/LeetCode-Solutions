class Solution {
    int help(int a, int b, int[][] grid, int zero){
        if(a<0 || b<0 || a>=grid.length || b>=grid[0].length || grid[a][b] == -1) return 0;
        if(grid[a][b] == 2){
            return zero == -1 ? 1 : 0;
        }
        grid[a][b] = -1;
        zero--;
        int total = help(a+1, b, grid, zero) + help(a-1, b, grid, zero) + help(a,b+1, grid, zero) + help(a, b-1, grid, zero);
        grid[a][b] = 0;
        zero++;
        return total;
        
        
    }
    public int uniquePathsIII(int[][] grid) {
        int a=0, b=0, zero=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 0) zero++;
                if(grid[i][j] == 1){
                    a=i;b=j;
                }
            }
        }
        int ans = help(a, b, grid, zero);
        return ans;
    }
}