class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i=0, j=0;
        int n = s.length();
        int m = spaces.length;
        char[] chs = new char[m+n];
        for(char ch : s.toCharArray()){
            if(i<m && j == spaces[i]){
                chs[i+j] = ' ';
                i++;
            }
            chs[i+j] = ch;
            j++;
        }
        return new String(chs);
    }
}