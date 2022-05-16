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
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> outer= new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    
    if(root!=null)
        q.add(root);
    else
        return outer;
    
    while(!q.isEmpty())
    {
         double x = 0,s=0;
         List<Integer> inner = new ArrayList<>();
         double n = q.size();
         while(x<n)
         {
            TreeNode temp = q.peek();
            s+=temp.val;
            q.remove();
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
            x++;
        }
        outer.add(s/n);
    }
    return outer;
    }
}