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
    TreeNode ans,target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target=target;
        preorder(original,cloned,target);
        return ans;
    }
    
    public void preorder(TreeNode n1,TreeNode n2,TreeNode c)
    {
        if(n1==null || n2==null)
            return;
        if(n1==c && c.val==n2.val)
            ans=n2;
        preorder(n1.left,n2.left,c);
        preorder(n1.right,n2.right,c);
    }
}