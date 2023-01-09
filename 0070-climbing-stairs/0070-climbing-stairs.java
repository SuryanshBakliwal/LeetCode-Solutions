class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[ n + 1 ];
        return climbStairs(n, dp);
    }
    public int climbStairs(int n, int dp[]) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];
        int fib1 = climbStairs(n-1, dp);
        int fib2 = climbStairs(n-2, dp);

        dp[n] = fib1 + fib2;
        return fib1 + fib2;
    }
}