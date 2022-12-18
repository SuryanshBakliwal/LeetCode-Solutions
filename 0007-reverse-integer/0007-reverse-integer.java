class Solution {
    public int reverse(int x) {
        
        int temp = Math.abs(x);
        String str = Integer.toString(temp);
        long rev = 0;
        for(int i=str.length()-1;i>=0; i--){
            int a = temp%10;
            rev += a*Math.pow(10,i);
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
            temp = temp/10;  
        }
        if(x>0) return (int)rev;
        return (int)-rev;
    }
}