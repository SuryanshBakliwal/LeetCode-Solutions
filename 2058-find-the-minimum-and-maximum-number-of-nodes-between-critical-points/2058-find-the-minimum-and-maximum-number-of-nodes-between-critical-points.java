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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if((head.next == null) ||  (head.next.next == null)) return new int[]{-1,-1};
        
        ListNode prev = head, curr = head.next, next = head.next.next;
        int minDistance = Integer.MAX_VALUE, maxDistance = 0;
        int lastCP = 0, firstCP = 0;
        int i = 2, cp = 0, j = 0;
        while(next != null){
            //Local Maxima
            if((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)){              
                if(firstCP == 0 ) firstCP = i;
                if(lastCP == 0 ) lastCP = i;
                minDistance = minDistance == 0 ? i-lastCP :  Math.min(i-lastCP,minDistance);
                maxDistance = i-firstCP; 
                lastCP = i;j++;
            }
            prev = curr;
            curr = next;
            next = next.next;
            i++;
        }
        if((minDistance == Integer.MAX_VALUE && maxDistance==0) || j==1) return new int[]{-1,-1};
        return new int[]{minDistance, maxDistance};
    }
}