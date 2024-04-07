class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> ob = new Stack<>(), at = new Stack<>();
        int i=0;
        for(char c : s.toCharArray()){
            if(c == '('){
                ob.push(i);
            }else if(c == '*'){
                at.push(i);
            }else if(c == ')'){
                
                if(ob.size() != 0) ob.pop();
                else if(at.size() != 0) at.pop();
                else return false;
                
            }
            i++;
        }
        
        while(ob.size() != 0 && at.size() != 0){
            if(ob.peek() > at.peek()) return false;
            ob.pop();
            at.pop();
        }
        
        return ob.empty();
    }
}