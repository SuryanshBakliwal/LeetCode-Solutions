class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;        
        HashMap<Character, String> map = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                // System.out.println("heelo");
                
                System.out.println(map.get(ch) + " " + str[i]);
                if(!map.get(ch).equals(str[i])){
                  return false;  
                } 
            }else{
                if(map.containsValue(str[i])) return false;
                map.put(ch, str[i]);
            }
           
        }
        return true;
    }
}