/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode par;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val)
            return search(root,q,p);
        else
            return search(root,p,q);
    }
    public TreeNode search(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null)
            return null;
        if(root.val>=p.val && root.val<=q.val)
            return root;
        else if(root.val>=p.val )
            return search(root.left,p,q);
        else
           return search(root.right,p,q);
          
    }
}