class Solution {
    public String makeGood(String s) {
        if(s.length() == 1) return s;
        
        Stack<Character> st = new Stack<>();
        char chars[] = s.toCharArray();
        for(char c : chars){
            if(st.size() != 0 && Math.abs(st.peek() - c) == 32){
                st.pop();
            }
            else st.push(c);
        }
        char res[] = new char[st.size()];
        for(int i=res.length-1; i>=0; i--) 
            res[i] = st.pop();
        return new String(res);
    }
}