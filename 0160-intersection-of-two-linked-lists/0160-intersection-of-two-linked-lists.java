/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int sizeOfList(ListNode head){
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode t1 = headA, t2 = headB;
        int size1 = sizeOfList(headA), x = 0;
        int size2 = sizeOfList(headB);
        if(size1 > size2 ){
            x = size1 - size2;
            for(int i=0; i<x; i++){
                t1 = t1.next;
            }
        }else{
            x = size2 - size1;
            for(int i=0; i<x; i++)
            t2 = t2.next;
        }
        while(t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}