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
    public boolean findTarget(TreeNode root, int k) {
       HashSet hs=new HashSet();
       return inOrder(root,hs,k);
    }
    public boolean inOrder(TreeNode root,HashSet hs,int k)
    {
        if(root==null)
            return false;
        if(hs.contains(k-root.val))
            return true;
        else
            hs.add(root.val); 
        return inOrder(root.left,hs,k) || inOrder(root.right,hs,k);
    }
}