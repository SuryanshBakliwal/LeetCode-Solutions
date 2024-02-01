class Solution {
    public int longestValidParentheses(String s) {
        int ans=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') st.push(i);
            else{
                if(!st.empty()){
                    if(s.charAt(st.peek()) == '(') st.pop();
                    else st.push(i);
                }
                else{
                    st.push(i);
                }
            }
        }
        if(st.size() == 0){
            ans = s.length();
        }else {
            int a = s.length(), b = 0;
            while (!st.empty()) {
                b = st.peek(); st.pop();
                ans = Math.max(ans, a-b-1);
                a = b;
            }
            ans = Math.max(ans, a);
        }
        return ans;
        
    }
}