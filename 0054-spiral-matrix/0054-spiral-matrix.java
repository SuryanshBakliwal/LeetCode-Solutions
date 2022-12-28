class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        List<Integer> res = new ArrayList<Integer>();
        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;


        int tne = arr.length * arr[0].length;     //total numbers of elements
        int count = 0;

        while (count < tne) {
            //top wall
            if (count < tne) {
                for (int i = mincol; i <= maxcol; i++) {
                res.add(arr[minrow][i]);
                count++;
                }
            }
            minrow++;
            //right wall
            if (count < tne) {
                for (int i = minrow; i <= maxrow; i++) {
                res.add(arr[i][maxcol]);
                count++;
                }
            }
            maxcol--;
            //bottom wall
            if (count < tne) {
                for (int i = maxcol; i >= mincol; i--) {
                res.add(arr[maxrow][i]);
                count++;
                }
            }
            maxrow--;
            //left wall
            if (count < tne) {
                for (int i = maxrow; i >= minrow; i--) {
                res.add(arr[i][mincol]);
                count++;
                }
            }
            mincol++;
            
        }

        return res;
    }
}