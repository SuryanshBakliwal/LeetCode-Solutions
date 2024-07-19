class Solution {
    public List<Integer> luckyNumbers (int[][] M) {
        int m = M.length, n = M[0].length;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<m; i++){
            int num = Integer.MAX_VALUE;
            int idx=-1;
            for(int j=0; j<n; j++){
                if(M[i][j] < num){   
                    num = M[i][j];
                    idx = j;
                }
            }
            boolean flag = true;
            for(int k=0; k<m; k++){
                if(num < M[k][idx]) {flag = false; break;};
            }
            if(flag) res.add(num);
        }
        return res;
    }
}