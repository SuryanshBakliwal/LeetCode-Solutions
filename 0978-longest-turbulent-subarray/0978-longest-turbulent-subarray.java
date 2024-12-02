class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int res = 0, cnt = 0;
        for(int i=0; i<arr.length-1; i++, cnt *= -1){
            if(arr[i] > arr[i+1]){
                cnt = cnt > 0 ? cnt + 1: 1;
            }else if(arr[i] < arr[i+1]){
                cnt = cnt < 0 ? cnt - 1: -1;
            }else{
                cnt = 0;
            }
            res = Math.max(res, Math.abs(cnt));
        }
        return res+1;
    }
}