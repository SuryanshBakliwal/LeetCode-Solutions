//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else if(ch == ')'){
                if(stk.size() == 0 || stk.peek() != '('){
                    return false;
                }else stk.pop();
            }else if(ch == '}'){
                if(stk.size() == 0 || stk.peek() != '{'){
                    return false;
                }else stk.pop();
            }else if(ch == ']'){
                if(stk.size() == 0 || stk.peek() != '['){
                    return false;
                }else stk.pop();
            }
        }
        if(stk.size() == 0)  return true;
        else return false;
    }
} 