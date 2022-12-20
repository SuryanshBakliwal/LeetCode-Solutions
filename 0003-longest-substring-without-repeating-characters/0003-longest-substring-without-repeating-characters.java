class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=-1;
        int j=-1;
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            // Acquire Until You Become InValid
            boolean flag1 = false, flag2 = false;
            while(j<s.length()-1){
                j++;
                char ch = s.charAt(j);
                flag1 =true;
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(map.get(ch)==2){
                    break;
                }else{
                    int len = j-i;
                    if(ans<len) ans = len;
                }
            }
            // Release After Until Become Valid
            while(i<j){
                i++;
                flag2 = true;
                char ch = s.charAt(i);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 1){
                    break;
                }
            }
            if(flag1==false && flag2==false) break;
        }
        return ans;
    }
}