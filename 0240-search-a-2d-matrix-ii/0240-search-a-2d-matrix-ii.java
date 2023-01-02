class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        if(arr == null || arr.length < 1 || arr[0].length <1) {
            return false;
        }
        int li = 0;
        int ri = arr[0].length-1;
        while(li<arr.length && ri>=0){
            if(tar == arr[li][ri]) return true;
            else if(tar < arr[li][ri]) ri--;
             else if(tar > arr[li][ri]) {
                li++;
            }
        }
        return false;
    }
}