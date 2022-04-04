/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return SortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode SortedArrayToBST(int[] nums,int i,int j) {
        if(i>j) return null;
        int mid=(i+j)/2;
        TreeNode a=new TreeNode(nums[mid]);
        a.left=SortedArrayToBST(nums,i,mid-1);        
        a.right=SortedArrayToBST(nums,mid+1,j);
        return a;
    }
}