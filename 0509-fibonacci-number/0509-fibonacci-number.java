class Solution {
    
    public int fibHelper(int n,int[] dp){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        
        dp[n] = fibHelper(n-1, dp) + fibHelper(n-2, dp);
        return dp[n];
    }
    
    public int fib(int n) {
        int arr[] = new int[n+2]; 
        return fibHelper(n, arr);
    }
}