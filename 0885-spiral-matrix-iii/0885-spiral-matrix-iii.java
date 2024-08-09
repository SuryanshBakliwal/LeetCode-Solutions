class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int r0, int c0) {
        int totalLen = rows*cols;
        int matrix[][] = new int[totalLen][2];
        int i=0;
        matrix[i++] = new int[]{r0, c0};
        int len=0;
        int[] dir = new int[]{0, 1, 0, -1, 0};
        int d=0;
        while(i < totalLen){
            if(d == 0 || d == 2){
                len++;
            }
            for(int k=0; k<len; k++){
                r0 += dir[d];
                c0 += dir[d+1];
                if(r0 < rows && c0 < cols && r0 >= 0 && c0 >= 0){
                    matrix[i++] = new int[]{r0, c0};
                }
            }
            d = ++d % 4; 
        }
        return matrix;
    }
}