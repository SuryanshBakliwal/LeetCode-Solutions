class Solution {
    public boolean palindrome(String subs){
          int li = 0;
          int ri = subs.length()-1;
          while(li<=ri){
              char f = subs.charAt(li);
              char l = subs.charAt(ri);
              if(f != l){
                  return false;
              }
              
              li++;
              ri--;
          }
          return true;
      }
    public int countSubstrings(String str) {
    //write your code here
        int count = 0;
        for(int i=0;i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                
                if(palindrome(str.substring(i,j))){
                    count++;
                }
                
            }
        }
        
        return count;
      }
}