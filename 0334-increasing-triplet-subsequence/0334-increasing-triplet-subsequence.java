class Solution {
    public boolean increasingTriplet(int[] arr) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= small) small = arr[i];
            else if(arr[i] <= big) big = arr[i];
            else return true;
        }
        return false;
    }
}