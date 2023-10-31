class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for(int i=0; i<fb.length; i++){
            if(fb[i] == 0){       
                int prev = (i == 0) ? 0 : fb[i-1];
                int next = (i == fb.length-1) ? 0 : fb[i+1];
                if(next==0 && prev==0 && n != 0){
                    fb[i]=1;
                    n--;
                }
            }
        }
        if(n==0) return true;
        return false;
    }
}