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
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        inorder(root,targetSum,0);
        return ans;
    }
    public void inorder(TreeNode root,int sum,int s)
    {
        if(root!=null)
        {
          if(root.left==null && root.right==null && sum==s+root.val){
            ans=true; 
            return;
          }
          inorder(root.left,sum,s+root.val);
          inorder(root.right,sum,s+root.val);
        }  
    }
}