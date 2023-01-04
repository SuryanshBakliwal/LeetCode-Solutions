class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch<= 'Z'){
                char lc = (char)('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
        }
        
        return sb.toString();
    }
}