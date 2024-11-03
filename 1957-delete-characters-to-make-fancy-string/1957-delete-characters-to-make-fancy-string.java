class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        char prev=s.charAt(0);
        sb.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == prev) cnt++;
            else{
                prev = s.charAt(i);
                cnt=1;
            }
            if(cnt < 3) sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}