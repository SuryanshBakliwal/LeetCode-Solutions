class Solution {
    public long minimumCost(String src, String tar, char[] original, char[] changed, int[] cost) {
        int[][] dis = new int[26][26];
        for(int i=0; i<26; i++){ 
            Arrays.fill(dis[i], Integer.MAX_VALUE);
            dis[i][i] = 0;
        }
        
        for(int i=0; i<original.length; i++){
            dis[original[i] - 'a'][changed[i] - 'a'] = Math.min(dis[original[i] - 'a'][changed[i] - 'a'] ,cost[i]);
        }
        for(int k=0; k<dis.length; k++){
            for(int i=0; i<dis.length; i++){
                if(dis[i][k] < Integer.MAX_VALUE){
                    for(int j=0; j<dis.length; j++){
                        if(Integer.MAX_VALUE > dis[k][j])
                        dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                    }
                }
            }
        }
        long res = 0;
        for(int i=0; i<src.length(); i++){
            if(src.charAt(i) != tar.charAt(i)){
                if(dis[src.charAt(i) - 'a'][tar.charAt(i) - 'a'] == Integer.MAX_VALUE) return -1;
                res += dis[src.charAt(i) - 'a'][tar.charAt(i) - 'a']; 
            }
        }
        return res;
    }
}