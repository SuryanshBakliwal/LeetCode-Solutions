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
    public ListNode mergeNodes(ListNode head) {
        ListNode t1 = head.next;
        while(t1 != null){
            ListNode t2 = t1.next;
            while(t2.val != 0){
                t1.val += t2.val;
                t2 = t2.next;
            }
            t1.next = t2.next;
            t1 = t1.next;
        }
        return head.next;
    }
}