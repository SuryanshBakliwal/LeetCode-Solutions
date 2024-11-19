class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int i=0, j=0, prev=Integer.MAX_VALUE;
        while(j<s.length()){
            if(s.charAt(j) == c){
                while(i <= j){
                    res[i] = Math.min(Math.abs(j-i), Math.abs(prev-i));
                    i++;
                }
                prev=j;
            }
            j++;
        }
        if(i < s.length()){
            while(i < s.length() && i <= j){
                    res[i] = Math.abs(prev-i);
                    i++;
                }
        }
        return res;
    }
}