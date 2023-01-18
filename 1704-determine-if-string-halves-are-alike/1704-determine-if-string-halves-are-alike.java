class Solution {
    public boolean checkVowels(char s){
        switch(s){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            return true;    
        }
        
        return false;
    }
    
    public boolean halvesAreAlike(String s) {
        int i = 0;
        int count = 0;
        int j = s.length()/2;
        while(i<s.length()/2){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(checkVowels(a)) count++;
            if(checkVowels(b)) count--;
            
            i++;
            j++;
        }
        
        if(count == 0) return true;
        
        return false;
    }
}