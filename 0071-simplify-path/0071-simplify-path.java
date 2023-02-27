class Solution {
    public String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        StringBuilder res = new StringBuilder();
        String s[] = path.split("/");
        for(String dir : s){
            if(!stk.isEmpty() && dir.equals("..")) stk.pop();
            else if(!dir.equals("") && !dir.equals(".") && !dir.equals("..")) stk.push(dir);
        }
        if(stk.isEmpty()) return "/";
        while(!stk.isEmpty()){
            res.insert(0, stk.pop()).insert(0, "/");
        }
                                            
        return res.toString();
    }
}