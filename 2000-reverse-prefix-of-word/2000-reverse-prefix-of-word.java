class Solution {
    public String reversePrefix(String s, char ch) {
        int i=0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == ch){
                break;
            }
        }
        if(i == s.length()) return s;
        StringBuilder sb = new StringBuilder(s.substring(0, i+1));
        sb.reverse();
        for(int j=i+1; j<s.length(); j++){
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }
}