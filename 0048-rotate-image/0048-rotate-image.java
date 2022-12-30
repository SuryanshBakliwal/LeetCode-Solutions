class Solution {
    public void rotate(int[][] arr) {
        // rotate(90) -> transpose(A) -> Reverse(A')
        
        // Tanspose of matrix = A'
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        // Reverse -> (A')
        // --> treat row as a single array
        for(int i =0 ; i<arr.length; i++){
            for(int j = 0; j<arr.length/2; j++){
                int temp = 0;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }
}