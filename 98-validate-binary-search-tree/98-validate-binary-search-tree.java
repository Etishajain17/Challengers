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
    public boolean isValidBST(TreeNode root) {
        return isBST(root,Long.MIN_VALUE+1,Long.MAX_VALUE);
    }
    public boolean isBST(TreeNode root,long min,long max){
        if(root==null) return true;
        return (root.val>min && root.val<max && isBST(root.left,min,root.val) && isBST(root.right,root.val,max));
    }
}
// class Solution {
//     int prev=Integer.MIN_VALUE;
//     public boolean isValidBST(TreeNode root) {
//         if(root == null) return true;
//         if(isValidBST(  root.left)==false) return false;
//         if(root.val<=prev) return false;
//         prev=root.val;
//         return isValidBST(root.right);
//     }
// }