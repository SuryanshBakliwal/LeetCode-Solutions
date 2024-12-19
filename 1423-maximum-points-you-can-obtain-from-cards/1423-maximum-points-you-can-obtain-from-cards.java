class Solution {
    public int maxScore(int[] A, int K) {
        int totalSum = 0; int res=0;
        for(int i : A) totalSum += i;
        int curSum=0, L=0;
        for(int R=0; R<A.length; R++){
            curSum += A[R];
            while( R - L + 1 > A.length - K ){
                curSum -= A[L++];
            }
            if(R - L + 1 == A.length - K)   res = Math.max(res, totalSum - curSum);
        }
        return res;
    }
}