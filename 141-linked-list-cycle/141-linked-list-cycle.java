/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if (head == null || head.next == null)
            return false;
        ListNode pointer1 = head,pointer2 = head;
        while (pointer1 != null && pointer1.next != null)
        {
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
            if (pointer1 == pointer2)
                return true;
        }
        return false;
    }
}