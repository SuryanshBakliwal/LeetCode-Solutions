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
    public int pairSum(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rev = slow.next;
        slow.next = null;
        ListNode cur = rev, next = rev, prev = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        rev = prev;
        int max=0;
        while(head != null){
            int twinSum = head.val + rev.val;
            if(max < twinSum) max = twinSum;
            head = head.next; rev = rev.next;
        }
        
        return max;
        
    }
}