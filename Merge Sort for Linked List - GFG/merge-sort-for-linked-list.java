//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node merge(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        Node handler;
        if(l1.data<l2.data){
            handler = l1;
            handler.next = merge(l1.next, l2);
        }else{
            handler = l2;
            handler.next = merge(l1, l2.next);
        }
        
        return handler;
    }
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head == null || head.next == null) return head;
        
        Node fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        prev.next = null;
        Node l1 = mergeSort(head);
        Node l2 = mergeSort(slow);
        
        return merge(l1, l2);
        
    }
}


