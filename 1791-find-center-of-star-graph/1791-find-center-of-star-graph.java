class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] edge : edges){
            map.put(edge[0], map.getOrDefault(edge[0], 0)+1);
            map.put(edge[1], map.getOrDefault(edge[1], 0)+1);
        }
        int max=0, res=0;
        for(int v : map.keySet()){
            if(map.get(v) > max){
                max = map.get(v); res=v;
            }
        }
        return res;
    }
}