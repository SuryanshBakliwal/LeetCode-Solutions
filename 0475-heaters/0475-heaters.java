class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int min = Integer.MIN_VALUE;
        Arrays.sort(heaters);
        for(int house : houses){
            int ind = findClosest(heaters, house);
            min = Math.max(min, Math.abs(house-heaters[ind]));
        }
        return min;
    }
    
    int findClosest(int[] arr, int target){
        int l=0, r = arr.length-1;
        int res=0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(Math.abs(arr[mid]-target) < Math.abs(arr[res]-target)){
                res = mid;
            }
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return res;
    }
}