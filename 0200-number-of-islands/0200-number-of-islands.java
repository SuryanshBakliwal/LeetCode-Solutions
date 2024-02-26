class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(visited[i][j] != true && grid[i][j] == '1'){
                    dfs(visited, grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    void dfs(boolean[][] visited, char[][] grid, int i, int j){
        if(i<0 || j<0|| j>=grid[0].length || i>=grid.length || grid[i][j] == '0' ||visited[i][j] == true) return;
        
        visited[i][j] = true;
        dfs(visited, grid, i-1,j);
        dfs(visited, grid, i,j-1);
        dfs(visited, grid, i,j+1);
        dfs(visited, grid, i+1,j);
    }
    
}