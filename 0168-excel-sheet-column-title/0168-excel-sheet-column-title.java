class Solution {
    public String convertToTitle(int colnum) {
        StringBuilder sb = new StringBuilder();
        while(colnum > 0){
            colnum--;
            int rem = colnum % 26;
            sb.append((char)(rem +'A'));
            colnum /= 26;
        }
        return sb.reverse().toString();
    }
}