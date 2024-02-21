class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c != '*'){
                st.push(c);
            }else{
                st.pop();
            }
        }
        String ans = "";
        while(st.size() != 0){
            ans = "" + st.pop() + ans;
        }
        return ans;
    }
}