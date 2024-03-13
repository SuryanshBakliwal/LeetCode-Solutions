class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int l=1, r=n;
        int ls=1, rs=n;
        while(l<r){
            if(ls == rs && l+1 == r-1){
                return l+1;
            }else if(ls>rs ){
                r--;
                rs += r;
            }
            else{
                l++;
                ls += l;
            }
        }
        return -1;
    }
}