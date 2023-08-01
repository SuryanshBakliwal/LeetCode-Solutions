class Solution {
    public String convert(String s, int rows) {
        char[] c = s.toCharArray();
        int l = s.length();
        StringBuilder[] sb = new StringBuilder[rows];
        for(int i=0; i<rows; i++){
            sb[i] = new StringBuilder();
        }
        int i=0;
        while(i<l){
            for(int idx=0; idx<rows && i<l; idx++){
                sb[idx].append(c[i++]);
            }
            for(int idx=rows-2; idx>0 && i<l; idx--){
                sb[idx].append(c[i++]);
            }
        }
        for(i=1; i<rows; i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}