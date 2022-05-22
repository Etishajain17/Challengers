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
    int sum=0,cn=0,ans=0;
    public int averageOfSubtree(TreeNode root) {
        avcn(root);
        count(root,sum/cn);
        return ans;
    }
    
    public void count(TreeNode root,int x)
    {
        if(root!=null)
        {
            if(root.val==x)
                ans++;
            sum=0;cn=0;
            if(root.left!=null){
            avcn(root.left);
            count(root.left,sum/cn);
            }
            sum=0;cn=0;
            if(root.right!=null){
            avcn(root.right);
            count(root.right,sum/cn);
            }
            return;
        }
    }
    
    
    public void avcn(TreeNode root)
    {
        if(root!=null)
        {
            sum+=root.val;
            cn+=1;
            avcn(root.left);
            avcn(root.right);
            return;
        }
    }
}