/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        //Efficient Approach O(n+m) Time complexity and O(1) Space Complexity
        ListNode tempA = headA,tempB = headB;
        while (tempA != null) 
        {
            tempA.val = -tempA.val;
            tempA = tempA.next;
        }
        ListNode inter = null;
        while (tempB != null && inter == null) 
        {
            if (tempB.val < 0){
                inter = tempB;
                break;
            }
            tempB = tempB.next;
        }
        tempA = headA;
        while (tempA != null) 
        {
             tempA.val = -tempA.val;
            tempA = tempA.next;
        }
        return inter;
        
        
        
        //Naive Approach  O(nm) Time complexity and O(1) Space Complexity
//         ListNode tempA=headA,tempB=headB;
//         while(tempA!=null)
//         {
//             tempB=headB;
//             while(tempB!=null)
//             {
//                 if(tempA==tempB)
//                     return tempA;

//                 tempB=tempB.next;
//             }
//             tempA=tempA.next;
//         }
//         return null;
    }
}