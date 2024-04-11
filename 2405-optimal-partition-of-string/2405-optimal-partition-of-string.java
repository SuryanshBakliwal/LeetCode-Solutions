class Solution {
    public int partitionString(String s) {
        boolean check[] = new boolean[26];
        int ans=0;
        for(int i=0; i<s.length(); i++){
            if(check[s.charAt(i)-'a'] == true){
                ans++;
                check = new boolean[26];
            }
            check[s.charAt(i)-'a'] = true;
        }
        return ans+1;
    }
}