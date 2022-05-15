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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        InOrder(root);
        InOrder2(root);
        return root;
    }
    public void InOrder(TreeNode root)
    {
        if(root==null)
            return;
        InOrder(root.left);
        sum+=root.val;
        InOrder(root.right);
    }
    public void InOrder2(TreeNode root)
    {
        if(root==null)
            return;
        InOrder2(root.left);
        int t=root.val;
        root.val=sum;
        sum-=t;
        InOrder2(root.right);
    }
}