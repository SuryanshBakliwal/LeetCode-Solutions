class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        boolean [][]dp = new boolean[s.length()][s.length()];
        String res = "";
        for(int gap=0; gap<dp.length; gap++){
            for(int i=0, j=gap; j<dp.length; j++, i++){
                if(gap==0){
                    dp[i][j] = true;
                }
                else if(gap==1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        // res = s.substring(i,j+1);
                    }
                    else dp[i][j] = false;
                }
                else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                        // res = s.substring(i,j+1); 
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    res = s.substring(i,j+1);
                } 
            }
        }
        
        return res;
    }
}