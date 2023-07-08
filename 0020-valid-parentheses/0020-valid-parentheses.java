class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 || s.length() == 0) return false;
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int i=1;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == ')'){
                if( st.size() == 0 || st.peek() != '('){
                    return false;
                }
                else st.pop();
            }else if(ch == '}'){
                if( st.size() == 0 || st.peek() != '{'){
                    return false;
                }
                else st.pop();
            }else if(ch == ']'){
                if( st.size() == 0 || st.peek() != '[' ){
                    return false;
                }
                else st.pop();
            }else{
                st.push(ch);
            }
            i++;
        }
         if(st.size() == 0)  return true;
        return false;
    }
}