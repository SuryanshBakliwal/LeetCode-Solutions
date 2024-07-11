class Solution {
    public String reverseParentheses(String s) {
        int n=s.length(); 
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else if(s.charAt(i) == ')'){
                int j = st.pop();
                arr[i] = j; arr[j] = i;
            }
        }
        int dir=1;
        for(int i=0; i<n; i += dir){
            if(s.charAt(i) == ')' || s.charAt(i)=='('){
                i = arr[i];
                dir *= -1;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    } 
}