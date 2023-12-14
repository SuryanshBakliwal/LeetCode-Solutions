class Solution {
    public int[][] onesMinusZeros(int[][] mat) {
        int m=mat.length, n=mat[0].length;
        int rowsOne[] = new int[m], colsOne[] = new int[n];
        int rowsZero[] = new int[m], colsZero[] = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    rowsOne[i]++;
                    colsOne[j]++;
                }else if(mat[i][j] == 0){
                    rowsZero[i]++;
                    colsZero[j]++;

                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = rowsOne[i] + colsOne[j] - rowsZero[i] - colsZero[j];
            }
        }
        
        return mat;
    }
}