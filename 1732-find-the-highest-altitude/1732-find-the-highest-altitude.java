class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int previous = 0;
        for(int i=0; i<gain.length; i++){
            gain[i] += previous;
            previous = gain[i];
            max = Math.max(max, gain[i]);
        }
        return max;
    }
}