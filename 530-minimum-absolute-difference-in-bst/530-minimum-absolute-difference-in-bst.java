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
    int mi=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        min1(root);
        return mi;
        
    }
    public void min1(TreeNode root)
    {
        if(root==null)
            return;
        if(root.left!=null)
        {
            mi=Math.min(root.val-predecessor(root.left).val,mi);
            mi=Math.min(root.val-root.left.val,mi);
        } 
        if(root.right!=null)
        {
            mi=Math.min(successor(root.right).val-root.val,mi);
            mi=Math.min(root.right.val-root.val,mi);
        }
        min1(root.left);
        min1(root.right);
    }
    public TreeNode successor(TreeNode x)
    {
        if(x.left==null)
            return x;
        return successor(x.left); 
    }
    public TreeNode predecessor(TreeNode x)
    {
        if(x.right==null)
            return x;
        return predecessor(x.right);
    }
}