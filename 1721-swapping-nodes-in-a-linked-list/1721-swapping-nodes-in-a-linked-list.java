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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        int la=c-k;
        temp=head;
        int de=0;
        int d=0;
        for(int i=0,j=0;i<c && j<c;i++,j++)
        {
            if(i==k-1)
            {
                d=temp.val;
            }
            if(i==la)
            {
                de=temp.val;
            }
            temp=temp.next;
        }
        temp=head;
        for(int i=0,j=0;i<c && j<c;i++,j++)
        {
            if(i==k-1)
            {
                temp.val=de;
            }
            if(i==la)
            {
                temp.val=d;
            }
            temp=temp.next;
            
        }
        return head;
    }
}