class Solution {
    
    public boolean checkAnagrams(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) != 0){
                    map.put(ch, map.get(ch)-1);
                }
                else return false; 
            }else{
                return false;
            }
        }
        return true;
    }
    
    
    public List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> ans = new ArrayList<>();
        
        for(int i=0; i<s.length; i++){
            if(s[i] != "-1") {
                List<String> temp = new ArrayList<>();
                temp.add(s[i]);
                
                for(int j=i+1; j<s.length; j++){
                    if(checkAnagrams(s[i], s[j])){
                        temp.add(s[j]);
                        s[j] = "-1";
                    }
                }
                ans.add(temp);
            }
        }
        return ans;
    }
}