class Solution {
    public int calculateOne(int num){
        int cnt=0;
        while(num>0){
            if(num%2 != 0){
                cnt++;
            }
            num /= 2;
        }
        return cnt;
    }
    
    public int[] sortByBits(int[] arr) {
        int bits[] = new int[arr.length];
        int ans[] = new int[arr.length];
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            bits[i] = calculateOne(arr[i]);
        }
        
        int l = 0;
        for(int j = 0; j <= 14; j++){
            int length = 0;
            for(int k = 0; k < bits.length; k++){
                if(j == bits[k]){
                    length++;
                    ans[l] = arr[k];
                    l++;
                }
            }
        }
        return ans;
    }
}