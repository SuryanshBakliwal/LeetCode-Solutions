class Solution {
    public int longestIdealString(String s, int k) {
        int dp[] = new int[26];
        int ans=0;
        for(int i=0; i<s.length(); i++){
            int max=0;
            for(char j='a'; j<='z'; j++){
                if(Math.abs((s.charAt(i) - j)) <= k ){
                    max = Math.max(max, 1+dp[j-'a']);
                }
            }
            dp[s.charAt(i)-'a']=max;
            ans=Math.max(ans, max);
        }
        return ans;
    }
}