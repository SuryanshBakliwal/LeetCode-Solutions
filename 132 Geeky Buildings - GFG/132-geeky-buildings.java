//{ Driver Code Starts
//Initial template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            if(ob.recreationalSpot(arr,n))
                System.out.println("True");
            else
                System.out.println("False");
        }
	}
}
// } Driver Code Ends


//User function template for C++

class Solution{
    static boolean recreationalSpot(int[] nums , int n){
        // Your code goes here 
         Stack<Integer> st = new Stack<>();
        
        int min[] = new int[nums.length];
        min[0] = nums[0];
        for(int i=1; i<nums.length; i++) min[i] = Math.min(min[i-1], nums[i]);
        
        for(int j=nums.length-1; j>=0; j--){
            while(st.size()>0 && st.peek() <= min[j]) st.pop();
            if(st.size()>0 && st.peek() < nums[j]) return true;
            st.push(nums[j]);
        }
        return false;
    }
};