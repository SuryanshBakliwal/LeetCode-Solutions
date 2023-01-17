class Solution {
    public int minFlipsMonoIncr(String s) {
        char[] str = s.toCharArray();
        int oc = 0;
        int fc = 0;
        for(char ch : str){
            if(ch == '0'){
                if(oc == 0) continue;
                else fc++;
            }
            else{
                oc++;
            }
            if(fc > oc) fc = oc;
        }
        
        return fc;
    }
}