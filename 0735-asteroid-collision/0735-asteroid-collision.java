class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int curr : arr){
            if(curr > 0){
                st.push(curr);
            }else{
                while(st.size() != 0 && st.peek() > 0 && -curr > st.peek()){
                    st.pop();
                }
                if(st.size() == 0 || st.peek() < 0){
                    st.push(curr);
                }else if(st.peek() == -curr){
                    st.pop();
                }
            }
        }
        int res[] = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}