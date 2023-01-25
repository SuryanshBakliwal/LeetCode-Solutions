class Solution {
    public int maxDepth(String s) {
        if(s.length() == 1){
            return 0;
        }
        Stack<Character> st = new Stack<>();
        int max=0;
        int temp=0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                temp += 1;
            }else if(ch == ')'){
                st.pop();
                temp -= 1;
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}