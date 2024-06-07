class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] words = sentence.split(" ");
        Collections.sort(dict, (a,b)->a.length()-b.length());
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            boolean flag = true;
            for(String match : dict){
                if(word.startsWith(match)){
                    flag=false;
                    for(String smallmatch : dict){
                        if(word.startsWith(smallmatch)){
                            sb.append(smallmatch);
                            sb.append(" ");
                            break;
                        }
                    }
                    break;
                }
            }
            if(flag == true){
                sb.append(word);
                sb.append(" ");
            }
        }
        String ans=sb.toString();
        return ans.trim();
        
    }
}