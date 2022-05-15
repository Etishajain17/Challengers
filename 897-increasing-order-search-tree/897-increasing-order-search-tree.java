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
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans=new TreeNode(0);
        cur=ans;
        inOrder(root);
        return ans.right;
    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
            return ;
        inOrder(root.left);
        root.left=null;
        cur.right=root;
        cur=root;
        inOrder(root.right);
    }
}