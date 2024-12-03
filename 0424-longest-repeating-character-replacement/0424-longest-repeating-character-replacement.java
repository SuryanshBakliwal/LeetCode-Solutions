class Solution {
    public int characterReplacement(String s, int k) {
        int max=0, res=0;
        int[] map = new int[26];
        int i=0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            max = Math.max(max, ++map[ ch - 'A' ]);
            while(j - i + 1 - max > k){
                map[s.charAt(i) - 'A']--;
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}