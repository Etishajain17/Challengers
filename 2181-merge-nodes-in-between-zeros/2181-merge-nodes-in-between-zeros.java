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
        ListNode temp=head;
        ListNode temp2=head.next;
        while(temp2.next!=null)
        {
            if(temp2.val!=0)
                temp.val+=temp2.val;
            else{
                temp.next=temp2;
                temp=temp.next;
            }
            temp2=temp2.next;      
        }
        temp.next=null;
        return head;
    }
}