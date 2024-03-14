class Solution {
    public void nextPermutation(int[] arr) {
        int idx = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]) {
                idx=i;
                break;
            }
        }
        if(idx==-1){
            Arrays.sort(arr);
            return;
            
        } 
        for(int i=arr.length-1; i>=0; i--){
            if(arr[idx] < arr[i]){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        int l = idx+1, r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
                                            
    }
}