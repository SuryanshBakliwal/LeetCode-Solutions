class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int count=1;
        int maxcol=n-1, maxrow=n-1;
        int mincol=0,minrow=0;
        while(minrow <= maxrow && mincol <= maxcol){
            //top wall           
                for (int i = mincol; i <= maxcol; i++) {
                    ans[minrow][i] = count++;
                }
                minrow++;
            //right wall
                for (int i = minrow; i <= maxrow; i++) {
                    ans[i][maxcol]=count++;
                }
                maxcol--;
            //bottom wall
                for (int i = maxcol; i >= mincol; i--) {
                    ans[maxrow][i]=count++;
                }
                maxrow--;
            //left wall
                for (int i = maxrow; i >= minrow; i--) {
                    ans[i][mincol]=count++;
                }
                mincol++;
        }
        return ans;
    }
}