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
    public int getDecimalValue(ListNode head) 
    {
        int c=1;
        double sum=0;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            c++;
        }
        temp=head;
        while(temp.next!=null)
        {
            if(temp.val==1)
            {
                sum=sum+java.lang.Math.pow(2,c-1);
            }
            c--;
            temp=temp.next;
        }
        if(temp.val==1)
        {
            sum=sum+1;
        }
        int sum1=(int)sum;
        return sum1;
    }
}