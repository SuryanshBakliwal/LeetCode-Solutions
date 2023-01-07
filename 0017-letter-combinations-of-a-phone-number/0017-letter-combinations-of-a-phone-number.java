class Solution {
    public static final String[] list = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> combination(String str){
        if(str.length() == 0){
            List<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        List<String> rres = combination(ros);
        List<String> mres = new ArrayList<>();
        String codes = list[ch - '0'];
        for(int i=0; i<codes.length(); i++){
            char ccodes = codes.charAt(i);
            for(String sres : rres){
                mres.add(ccodes + sres);                
            }
        }
        return mres;
    }
    
    
    
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
             List<String> temp = new ArrayList<>();
            return temp;
        }else{ 
            List<String> ans = combination(digits);
            return ans;
        }
    }
    
}