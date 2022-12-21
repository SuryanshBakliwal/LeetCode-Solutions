class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        String res = "";
        int c=0;
        while(c < first.length()){
            if(first.charAt(c) == last.charAt(c)){
                res = ""+first.substring(0,c+1);
                c++;
            }else{
               break; 
            }
        }
        if(c==0) return "";
        
        return res;
    }
}