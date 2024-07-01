class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0, n=arr.length;
        while( i < n && n-i >= 3){
            if(arr[i]%2 != 0){
                if(arr[i+1]%2 != 0){
                    if(arr[i+2]%2 != 0){
                        return true;
                    }else{
                        i=i+3;
                    }
                }else{
                    i=i+2;
                }
            }else{
                i++;
            }
        }
        return false;
    }
}