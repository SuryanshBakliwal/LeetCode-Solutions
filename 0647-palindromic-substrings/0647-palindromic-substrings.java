class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int ans=0;
        for(int di=0; di<n; di++){
            for(int i=0, j=di;  j<dp.length; i++, j++){
            
                if(di==0){
                    dp[i][j] = true;
                    ans++;
                }else if(di==1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        ans++;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true; 
                        ans++;
                    }else dp[i][j] = false;
                }
            }
        }
        return ans;
    }
}