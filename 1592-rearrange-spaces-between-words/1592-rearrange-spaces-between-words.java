class Solution {
    public String reorderSpaces(String text) {
        int spaces = text.length() - text.replaceAll(" ", "").length();
        text = text.trim();
        String[] s = text.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        if(s.length == 1){
            sb.append(s[0]);
            for(int i=0; i < spaces; i++)
                        sb.append(" ");
        }
        else{
            int spacesPerWord = spaces / (s.length - 1);
            for(String word : s){
                sb.append(word);
                System.out.println(spaces);
                for(int i=0; i < spacesPerWord && spaces > 0; i++){
                    sb.append(" "); spaces--;
                }
                
            }
            if(spaces > 0){
                for(int i=0; i < spaces; i++){
                    sb.append(" ");
                }
            }
            
        }
        
        
        
        return  sb.toString();
    }
}