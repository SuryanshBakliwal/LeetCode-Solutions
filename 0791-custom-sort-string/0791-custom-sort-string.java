class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);
            if(map.containsKey(ch)){
                int j = map.get(ch);
                while(j-- > 0){
                    sb.append(ch);
                }
                map.remove(ch);
            }
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int j = map.get(ch);
                while(j-- > 0){
                    sb.append(ch);
                }
                map.remove(ch);
            }
        }
        return sb.toString();
    }
}