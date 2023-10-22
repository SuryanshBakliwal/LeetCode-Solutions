class Solution {
    
    public boolean check(String word, String keyRow){
        boolean temp = true;
        for(char ch : word.toLowerCase().toCharArray()){
            boolean isTrue = false;
            for(char c : keyRow.toCharArray()){
                if(c == ch){
                    isTrue = true;
                    break;
                }
            }
            if(isTrue != true){
                return false;
            }
        }
        return temp;
    }
    
    
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(check(words[i],s1) || check(words[i],s2) || check(words[i],s3)){
                list.add(words[i]);
            }
        }
        String[] arr = new String[list.size()];
 
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        
        return arr;
    }
}