class Solution {
    public double findMaxAverage(int[] arr, int k) {
        long sum = 0;
        for(int i=0; i<k; i++) sum += arr[i];
        long max = sum;
        for(int i=k; i<arr.length; i++){
            sum += arr[i] - arr[i-k];
            max = Math.max(sum, max);
        }
        return (double)max/k;
    }
}