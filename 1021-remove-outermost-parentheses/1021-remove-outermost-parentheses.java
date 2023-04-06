class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' && st.size() == 0){
                st.push(ch);
            }
            else if(ch == '(' && st.size()>0){
                sb.append(ch);
                st.push(ch);
            }
            else if(ch == ')' && st.size()>1){
                sb.append(ch);
                st.pop();
            }
            else if(ch == ')' && st.size()==1){
                st.pop();
            }
        }
        return sb.toString();
    }
}