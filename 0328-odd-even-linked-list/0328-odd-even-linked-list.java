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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode itr1 = odd;
        ListNode itr2 = even;
        ListNode itr = head;
        int count = 1;
        while(itr != null){
            if(count % 2 == 1){
                itr1.next = itr;
                itr1 = itr1.next;
            }else{
                itr2.next = itr;
                itr2 = itr2.next;
            }
            count++;
            itr = itr.next;
        }
        itr2.next = null;
        itr1.next = even.next;
        return odd.next;
    }
}