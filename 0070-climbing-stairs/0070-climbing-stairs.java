class Solution {
    int help(int n, int[] qb){
        if(n==0 || n==1 || n==2) return n;
        if(qb[n] != 0) return qb[n];
        int res = help(n-1, qb) + help(n-2, qb);
        qb[n] = res;
        return res;
    }
    public int climbStairs(int n) {
        int qb[] = new int[n+1];
        return help(n, qb);
    }
}