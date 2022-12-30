class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0, n =  matrix.length, m = matrix[0].length;
        int hi = m * n - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            if(matrix[mid/m][mid % m] == target) {
                return true;
            }
            if(matrix[mid/m][mid % m] < target) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return false;
    }
}