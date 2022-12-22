class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        for(int i=0; num>0; i++){
            while(num>=values[i]){
                res += strs[i];
                num -= values[i];
            }
        }
        return res;
        
    }
}