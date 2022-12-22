class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int y=0;
        if(x<0) return false;
        
        while(temp>0){
            int z=temp%10;
            y = y*10 + z;
            temp = temp/10;
        }
        return x==y;
    }
}