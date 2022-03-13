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
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        temp=head;
        int startValue=0;
        int endValue=0;
        for(int i=0,j=0;i<size && j<size;i++,j++)
        {
            if(i==k-1)
                startValue=temp.val;
            
            if(i==size-k)
               endValue=temp.val;

            temp=temp.next;
        }
        temp=head;
        for(int i=0,j=0;i<size && j<size;i++,j++)
        {
            if(i==k-1)
                temp.val=endValue;

            if(i==size-k)
                temp.val=startValue;
                
            temp=temp.next;
            
        }
        
        return head;
    }
}