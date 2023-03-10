/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        
        // Approach 1
        // ListNode res = new ListNode(head.val);
        // ListNode curr = head, temp = res;
        // while(curr != null){
        //     if(temp.val != curr.val){
        //         ListNode nnode = new ListNode(curr.val);
        //         temp.next = nnode;
        //         temp = nnode;
        //     }
        //     curr = curr.next;
        // }
        // return res;
        
        //Approach 2
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}