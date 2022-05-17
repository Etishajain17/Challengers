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
    public int sumRootToLeaf(TreeNode root) {
        preorder(root,0);
        return sum;
    }
    public void preorder(TreeNode root,int s)
    {
        if(root!=null)
        {
            s=(s<<1) | root.val;
            if(root.left==null && root.right==null)
                sum+=s;
            preorder(root.left,s);
            preorder(root.right,s);
        }
    }
}