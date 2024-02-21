class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n = n * 10  + (c - '0');
            }else if(c == '['){
                st2.push(n);
                st1.push(sb);
                n=0;
                sb = new StringBuilder();
            }else if( c == ']'){
                int k = st2.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while(k-- > 0){
                    sb.append(temp);
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}