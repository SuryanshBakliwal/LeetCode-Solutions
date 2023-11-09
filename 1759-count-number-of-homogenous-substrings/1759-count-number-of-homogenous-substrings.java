class Solution {
    public int countHomogenous(String s) {
        int cnt=0, result=0, cur=0,mod = 1_000_000_007;
        for(int i=0; i<s.length(); i++){
            cnt = s.charAt(i) == cur ? cnt + 1 : 1;
            cur=s.charAt(i);
            result = (cnt + result) % mod;
        }
        return result;
    }
}