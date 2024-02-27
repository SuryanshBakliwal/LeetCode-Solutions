class Solution {
    public int findCircleNum(int[][] grid) {
        int count=0;
        boolean[] visited = new boolean[grid.length];
        for(int i=0; i<grid.length; i++){
            if(visited[i] == false){
                dfs(grid, visited, i);
                count++;
            }
        }
        return count;
    }
    void dfs(int[][] grid, boolean[] visited, int i){
        for(int j=0; j<grid.length; j++){
            if(visited[j] != true && grid[i][j] != 0){
                visited[j] = true;
                dfs(grid, visited, j);
            } 
        }
    }
}