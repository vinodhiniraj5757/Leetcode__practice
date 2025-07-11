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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        
        int c=0;
        while(temp!=null)
        {
           c++;temp=temp.next;
        }
        if(n==c)
        return head.next;
        ListNode prev=head;
        for(int i=0;i<c-n-1;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}