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
    int ans=0;
    public int deepestLeavesSum(TreeNode root) {
        int x=maxDepth(root);
        System.out.println(x);
        maxSum(root,x,0);
        return ans;
        
    }
    public void maxSum(TreeNode root,int x,int c){
        if(root!=null)
        {
            if(c==x-1){
                ans+=root.val;
                return;
            }
            maxSum(root.left,x,c+1);
            maxSum(root.right,x,c+1);
        }
    }
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
}