class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j=0;
        if(s.length() == 0) return true;
        while(i < t.length() && j<s.length()){
            char chs = s.charAt(j);
            char cht = t.charAt(i);
            if(chs == cht){
                i++;
                j++;
            }else i++;
            if(j == s.length()){
                return true;
            }
        }
        return false;
    }
}