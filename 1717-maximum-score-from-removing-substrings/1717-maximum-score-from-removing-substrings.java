class Solution {
    public int maximumGain(String s, int x, int y) {
        String s1 = "ab", s2 = "ba";
        StringBuilder sb = new StringBuilder(s);
        if(x < y){
            String temp1 = s1; s1 = s2; s2 = temp1;
            int temp2 = x; x = y; y = temp2;
        }
        
        return solve(sb, s1, x) + solve(sb, s2, y);
    }
    int solve(StringBuilder sb, String maq, int p){
        int tp=0, n=sb.length(), wIdx = 0;
        for(int r=0; r<n; r++){
            sb.setCharAt(wIdx++, sb.charAt(r));
            if(wIdx > 1 && sb.charAt(wIdx-1) == maq.charAt(1) && sb.charAt(wIdx-2) == maq.charAt(0)){
                wIdx -= 2;
                tp += p;
            }
        }
        sb.delete(wIdx, n);
        return tp;
    }
}