class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int cnt=0, j=0, i=0;
        while(i<sb.length()){
           if(sb.charAt(i) == sb.charAt(j)){
               cnt++; i++;
           }else{
               cnt=0;
               j=i;
           }
            if(cnt == 3){
                sb.deleteCharAt(j+1); cnt--; i--;
            }

        }
        return sb.toString();
    }
}