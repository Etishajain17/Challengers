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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        ListNode temp=list1,temp2=list2;
        if(temp2.val<=temp.val)
        {
            ListNode t=temp;
            temp=temp2;
            temp2=t;
        }
        while(temp.next!=null && temp2!=null)   
        {
            if(temp2.val<=temp.next.val)
            {
                ListNode t=temp2.next;
                temp2.next=temp.next;
                temp.next=temp2;
                temp2=t;
            } 
            else
            temp=temp.next;
        }
        if(temp2!=null)
            temp.next=temp2;
        if(list2.val<=list1.val)
            return list2;
        return list1;
        
    }
}