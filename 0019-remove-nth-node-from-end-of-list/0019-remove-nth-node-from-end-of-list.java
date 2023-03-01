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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int i = 0, listSize = size(head);
        if(listSize == 1 && n==1) head = null;
        else if(listSize == n){
            head = head.next;
        }
        else{
            int ifb = listSize - n;
            while(i < ifb-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        // System.out.println(temp.val);
        
        return head;
    }
}