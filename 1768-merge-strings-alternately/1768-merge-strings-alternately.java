class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String ans = "";
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                char c1 = word1.charAt(i);
                ans = ans + c1 + "";
            }
            if(i<word2.length()){
                char c2 = word2.charAt(i);                
                ans = ans + c2 + "";
            }
            i++;
        }
        return ans;
    }
}