class Solution {
    public int maxSumAfterPartitioning(int[] arr, int K) {
        int memo[] = new int[arr.length];
        memo[0] = arr[0];
        int initMax=arr[0];
        for(int i=1; i<K; i++){
            if(initMax < arr[i]){
                initMax = arr[i];
            }
            memo[i] = initMax*(i+1);
        }
        for(int i=K; i<arr.length; i++){
            int curr=0; int kIntervalMax=arr[i];
            for(int j=1; j<=K; j++){
                if(kIntervalMax < arr[i-j+1]) kIntervalMax = arr[i-j+1];
                curr = memo[i-j] + kIntervalMax*j;
                if(curr>memo[i]){
                    memo[i]=curr;
                }
            }
        }
        return memo[arr.length-1];
    }
}