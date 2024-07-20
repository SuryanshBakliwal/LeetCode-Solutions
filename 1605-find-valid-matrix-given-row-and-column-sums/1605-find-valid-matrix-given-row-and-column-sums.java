class Solution {
    public int[][] restoreMatrix(int[] rs, int[] cs) {
        int m = rs.length, n = cs.length;
        int [][] res = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[i][j] = Math.min(rs[i], cs[j]);
                rs[i] -= res[i][j]; cs[j] -= res[i][j];
            }
        }
        return res;
    }
}