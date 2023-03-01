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
   public int size(ListNode head){
        ListNode temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;          
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode deleteMiddle(ListNode head) {
        int listSize = size(head);
        if(listSize == 1) head = null;
        else{
            ListNode temp = head;
            int mid =listSize/2 ;
            int i=0;
            while(i++ < mid-1){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        
        return head;
    }
}