class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i=0, j=0;
        while(i<arr.length){
            if(arr[i]%2==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }else{
                i++;
            }
        }
        return arr;
    }
}