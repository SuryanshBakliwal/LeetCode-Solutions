class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(ifExist(board, row, col, i, j, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ifExist(char[][] board, int row, int col, int crow, int ccol, String w, int k){
        if(k >= w.length()) return true;
        if(crow<0 || ccol<0 || crow>=row || ccol>=col || board[crow][ccol] == '.' || w.charAt(k) != board[crow][ccol]){
            return false;
        }
        board[crow][ccol] = '.';
        boolean temp = ifExist(board, row, col, crow+1, ccol, w, k+1) 
            || ifExist(board, row, col, crow-1, ccol, w, k+1) 
            || ifExist(board, row, col, crow, ccol-1, w, k+1) 
            || ifExist(board, row, col, crow, ccol+1, w, k+1);
        board[crow][ccol] = w.charAt(k);
        return temp;
    }
}