class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1,j=1; i<=n; i++){
            if(n % i == 0){
                if(j==k) return i;
                j++;
            }
        }
        return -1;
    }
}