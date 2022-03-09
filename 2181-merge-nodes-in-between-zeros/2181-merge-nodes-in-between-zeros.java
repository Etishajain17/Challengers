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
class Solution 
{
    public ListNode mergeNodes(ListNode head) 
    {
        // if(head==null || head.next==null)
        //     return null;
        int s=0;
        ListNode temp=head.next;
        ListNode temp2=head;
        while(temp!=null)
        {
            if(temp.val==0)
            {
                temp2.next=new ListNode(s);
                temp2=temp2.next;
                s=0;
            }
            else
            {
                s=s+temp.val;
            }
            temp=temp.next;
        }
        return head.next;
    }
}