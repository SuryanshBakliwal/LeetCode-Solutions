class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int ans=0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String s="";
            for(int j=0; j<n; j++){
                s += grid[i][j] + "+";
            }
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(int j=0; j<n; j++){
            String s="";
            for(int i=0; i<n; i++){
                s += grid[i][j] + "+";
            }
            if(map.containsKey(s)) ans += map.get(s);
        }
        return ans;
    }
}