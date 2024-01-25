class Solution {
    
    public int fibmemo(int n, int[] qb){
        if(n==1 || n==0) return n;
        
        if(qb[n] != 0) return qb[n];
        
        int fib1 = fibmemo(n-1, qb);
        int fib2 = fibmemo(n-2, qb);
        qb[n] = fib1+fib2;
        
        return fib1+fib2;
    }
    
    public int fib(int n) {
        int qb[] = new int[n+1];
        return fibmemo(n, qb);
    }
}