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
    public boolean isPalindrome(ListNode head) {
       Stack<Integer>a=new Stack();
       ListNode curr=head;
       while(curr!=null)
       {
        
        a.push(curr.val);
        curr=curr.next;
       }
       ListNode temp=head;
       while(temp!=null)
       {
        if(temp.val!=a.pop())
        return false;
        temp=temp.next;
       }
       return true;
        
    }
}