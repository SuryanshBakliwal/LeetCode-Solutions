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
        if(s.length() == 0 || s.length() == 1) return false;
        Stack<Character> st = new Stack<>();
        int i=1;
        st.push(s.charAt(0));
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.size() == 0 || st.peek() != '(') return false;
                else st.pop();
            }else if(ch == '}'){
                if(st.size() == 0 || st.peek() != '{') return false;
                else st.pop();
            }
            else if(ch == ']'){
                if(st.size() == 0 || st.peek() != '[') return false;
                else st.pop();
            }else{
                st.push(ch);
            }
            i++;
        }
        if(st.size() == 0) return true;
        return false;
    }
} 