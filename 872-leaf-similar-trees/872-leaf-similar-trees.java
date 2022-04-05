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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList l1=new ArrayList();
        ArrayList l2=new ArrayList();
        leafy(root1,l1);leafy(root2,l2);
        return l1.equals(l2);
    }
    public void leafy(TreeNode root,ArrayList l)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
          l.add(root.val);
        leafy(root.left,l);
        leafy(root.right,l);
    }
}