class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr) map.put(a, map.getOrDefault(a, 0)+1);
        for(int t : target){
            if(!map.containsKey(t) || map.get(t) <= 0) return false;
            map.put(t, map.get(t)-1);
        }
        return true;
    }
}