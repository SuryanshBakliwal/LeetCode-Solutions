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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l1=list1, l2=list1;
        int t1=0,t2=0;
        while(t1++ < a-1){
            l1 = l1.next;
        }
        while(t2++ < b+1){
            l2 = l2.next;
        }
        l1.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = l2;
        return list1;
    }
}