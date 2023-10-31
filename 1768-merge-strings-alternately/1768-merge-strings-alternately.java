class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        String ans = "";
        while(i<word1.length() && j<word2.length()){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(j);
            ans = ans + c1 + c2 + "";
            i++; j++;
        }
        while(i<word1.length()){
            char c = word1.charAt(i);
            ans = ans + c + "";

            i++;
        }
        while(j<word2.length()){
            char c = word2.charAt(j);
            ans = ans + c  + "";
            j++;
        }
        return ans;
    }
}