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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) 
			 return true;
		 Queue<TreeNode> q = new LinkedList<>();
		 q.add(root.left); q.add(root.right);
		 while(!q.isEmpty()) {
			TreeNode a = q.poll();
			TreeNode b = q.poll();
			if(a == null && b == null) 
				continue;		
			if(a == null || b == null) 
				return false;
			if(a.val != b.val) 
				return false;
			q.add(a.left);
			q.add(b.right);
			q.add(a.right);
			q.add(b.left); 
         }
        return true;
    }
}