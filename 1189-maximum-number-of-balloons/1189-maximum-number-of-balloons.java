class Solution {
    public int maxNumberOfBalloons(String text) {
        Set<Character> set = new HashSet<>();
        String baloon = "balloon";
        for(char c : baloon.toCharArray()) set.add(c);
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : text.toCharArray()){ 
            if(set.contains(c)) map.put(c, map.getOrDefault(c, 0)+1);
        }
        int min = Integer.MAX_VALUE;
        if(map.size() < 5) return 0;
        for(char c : map.keySet()){
            int count= map.get(c);
            if(c == 'l' || c == 'o'){
                min = Math.min(min, (int)Math.floor(count/2));
            }
            else{
                min = Math.min(min, count);
            }
        }
        return min;
    }
}