class Solution {
    
    int finalRow = 0, finalCol = 0;
    int m = 0, n = 0;
    
    void findGroup(int[][] land, int i, int j){
        if(i<0 || j<0 || i>=m || j>=n || land[i][j] == 0) return;
        
        land[i][j]=0;
        
        findGroup(land, i+1, j);
        findGroup(land, i, j+1);
        
        finalRow = Math.max(finalRow, i);
        finalCol = Math.max(finalCol, j);
    } 
      
    public int[][] findFarmland(int[][] land) {
        m = land.length;
        n=land[0].length;

        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j]==1){
                    findGroup(land, i, j);
                    ans.add(new int[]{i, j, finalRow, finalCol});
                    finalRow=0;
                    finalCol=0;
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}