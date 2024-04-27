class Solution {
    int dp[][];
    int dist(int curr, int next, int n){
        int clock = Math.abs(curr - next);
        int anticlock = n - clock;
        return Math.min(clock, anticlock);
    }
    int helper(String ring, String key, int i, int j){
        if(key.length() == j) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=0; k<ring.length(); k++){
            if(ring.charAt(k) == key.charAt(j)){
                int dis = dist(i, k, ring.length()) + 1 + helper(ring, key, k, j+1);
                min = Math.min(dis, min);
            }
        }
        dp[i][j] = min;
        return dp[i][j];
    }
    
    public int findRotateSteps(String ring, String key) {
        dp = new int[ring.length()][key.length()];
        return helper(ring, key, 0, 0);
        
    }
}