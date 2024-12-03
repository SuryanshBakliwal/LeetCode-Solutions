class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0;
        int res=0;
        Map<Character, Integer> freq = new HashMap<>();
        for(; j<s.length(); j++){
            char ch = s.charAt(j);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            while(freq.get(ch) > 1){
                char c = s.charAt(i);
                freq.put(c, freq.getOrDefault(c,0)-1);
                i++;
            }
            res = Math.max(res, j-i+1);
        }
        return res;
        
    }
}