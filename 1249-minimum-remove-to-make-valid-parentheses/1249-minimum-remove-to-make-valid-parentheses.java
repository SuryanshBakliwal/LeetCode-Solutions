class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '(') st.push(i);
            if(sb.charAt(i) == ')'){
                if(st.size() != 0) st.pop();
                else sb.setCharAt(i, '*');
            }
        }
        while(st.size() != 0){
            sb.setCharAt(st.pop(), '*');
        }
        
        return sb.toString().replaceAll("\\*","");
    }
}