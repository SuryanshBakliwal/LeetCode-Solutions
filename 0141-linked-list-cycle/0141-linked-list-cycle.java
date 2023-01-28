/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> map = new HashSet<ListNode>();
        ListNode temp = head;
        while(temp != null){
            if(map.contains(temp)){
                return true;
            }
            
            map.add(temp);
            temp = temp.next;
        }
        
        return false;
    }
}