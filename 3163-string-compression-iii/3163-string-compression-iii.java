class Solution {
    public String compressedString(String word) {
        
        StringBuilder res = new StringBuilder();
        int cnt=1;
        char prev = word.charAt(0);
        for(int i=1; i<word.length(); i++){
            if(prev == word.charAt(i) && cnt<9){
                cnt++;
            }
            else{
                res.append(cnt).append(prev);
                prev = word.charAt(i); cnt=1;
            }
        }
        res.append(cnt).append(prev);
        return res.toString();
    }
}