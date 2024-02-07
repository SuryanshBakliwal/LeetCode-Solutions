class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> check = new HashSet<>();

        for(int i:arr) map.put(i, map.getOrDefault(i, 0)+1);
        for(int key:map.keySet()){
            if(check.contains(map.get(key))){
                return false;
            }
            check.add(map.get(key));
        }
        return true;
    }
}