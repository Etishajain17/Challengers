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
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null, temp = null;
        ListNode temp2= head;
        while(temp2 != null) 
        {
            temp = temp2.next;
            temp2.next = prev;
            prev = temp2;
            temp2 = temp;}
        head=prev;
        return head;
    }
}