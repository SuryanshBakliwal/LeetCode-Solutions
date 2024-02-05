class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);  
        }
        int count = 0;
        int minj = 0;
        int j = 0;
        int minlen = s.length()+1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) >= 0){
                    count++;
                }
            }
            while(count == t.length()){
                if(i-j+1 < minlen){
                    minj=j;
                    minlen = i-j+1;
                }
                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                    if(map.get(s.charAt(j)) > 0){
                        count--;
                    }
                }
                j++;
            }
            
        }
        if(minlen>s.length()){
            return "";
        }
        return s.substring(minj, minj+minlen);
    }
}