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
    public ListNode middleNode(ListNode head)
    {
        int c=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            c++;
        }
        if(c==1)
            return head;
        c=c/2;
        int i=1;
        temp=head;
        while(i<c)
        {
            temp=temp.next;
            i++;
        }
        head=temp.next;
        return head;
    }
}