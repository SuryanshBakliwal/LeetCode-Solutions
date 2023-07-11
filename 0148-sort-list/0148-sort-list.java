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
    
    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode handler;
        if(l1.val < l2.val){
            handler = l1;
            handler.next = merge(l1.next, l2);
        }else{
            handler = l2;
            handler.next = merge(l1, l2.next);
        }
        return handler;
      } 

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        // step 1. cut the list to two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }

        prev.next = null;

        // step 2. sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // step 3. merge l1 and l2
        return merge(l1, l2);
    }
}