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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode curr=headB;
        while(temp!=curr)
        {
            if(temp==null)
            temp=headB;
            else
            temp=temp.next;

            if(curr==null)
            curr=headA;
            else
            curr=curr.next;
        }
        return curr;
        
    }
}