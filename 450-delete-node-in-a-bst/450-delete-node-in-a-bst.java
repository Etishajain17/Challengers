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
    public TreeNode deleteNode(TreeNode root, int key) {
        return deleteNode1(root,key);
    }
    public TreeNode deleteNode1(TreeNode root,int key)
    {
        if(root==null)
            return root;
        if(root.val>key)
            root.left=deleteNode1(root.left,key);
        else if(root.val<key)
            root.right=deleteNode1(root.right,key);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                root.val=sucessor(root.right).val;
                root.right=deleteNode1(root.right,root.val);
            }
        }
        return root;
    }
    public TreeNode sucessor(TreeNode root)
    {
        if(root.left==null)
            return root;
        return sucessor(root.left);
    }
}