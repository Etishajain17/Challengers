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
    int min=0;
    long ans=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min=root.val;
        dfs(root);
        if(ans==Long.MAX_VALUE)
            return -1;
        return (int)ans;
    }
    public void dfs(TreeNode root)
    {
        if(root!=null)
        {
            if(min<root.val && root.val<ans)
                ans=root.val;
            else if(min==root.val)
            {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
}