class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>1 && n%2==0){
            n /= 2;
            System.out.println(n);
        }
        if(n==1) return true;
        return false;
    }
}