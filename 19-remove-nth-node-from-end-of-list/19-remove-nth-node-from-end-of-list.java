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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        //Two Pointer Appoach { First Pointer is already n times ahead }
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=0; i < n; i++)
            temp1 =temp1.next;
        
        if(temp1 == null)
        {
            head = head.next;
            return head;
        }
        
        while(temp1.next != null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;
        
        return head;
        
        
        //OTHER APPROACH
        // int c=0;
        // ListNode temp1=head;
        // while(temp1!=null)
        // {
        //     temp1=temp1.next;
        //      c++;
        // }
        
        // if(head.next==null || head==null)
        //     return null;
        // else if(n==c)
        //     return head.next;
        
        // ListNode temp=head;
        // for(int i=0;i<c-n-1;i++)
        //     temp=temp.next;
        // temp.next=temp.next.next;
        // return head;
    }
}