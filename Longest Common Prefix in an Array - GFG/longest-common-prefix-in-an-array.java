//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        Arrays.sort(arr);
        String f = arr[0], res = "";
        String e = arr[n-1];
        int i=0;
        while(i < f.length()){
            if(f.charAt(i) == e.charAt(i)){
                res += "" + f.charAt(i);
                i++;
            }else break;
        }
        return res != "" ? res : "-1";
    }
}