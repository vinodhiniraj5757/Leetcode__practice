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
        if (head == null || head.next == null) {
            return false;
        }
        ListNode temp=head;
        ListNode curr=head.next;
      while(curr!=null && curr.next!=null)
      {
        temp=temp.next;
        curr=curr.next.next;
        if(temp==curr)
        return true;
      }
        return false;
    }
}