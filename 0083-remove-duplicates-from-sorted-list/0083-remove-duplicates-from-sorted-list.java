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
        ListNode res = new ListNode(head.val);
        ListNode curr = head, temp = res;
        while(curr != null){
            if(temp.val != curr.val){
                ListNode nnode = new ListNode(curr.val);
                temp.next = nnode;
                temp = nnode;
            }
            curr = curr.next;
        }
        return res;
    }
}