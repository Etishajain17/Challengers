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
    public int sumEvenGrandparent(TreeNode root) {
        return bfs(root);
    }
    public int bfs(TreeNode root)
    {
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
        int s=0;
        TreeNode temp=root;
       while(!queue.isEmpty())
       {
           int x=0,n=queue.size();
           while(x<n)
           {
               temp=queue.peek();
               queue.remove();
               if(temp.left!=null){
                   queue.add(temp.left);
                   if(temp.val%2==0){
                       if(temp.left.left!=null)
                           s+=temp.left.left.val;
                       if(temp.left.right!=null)
                           s+=temp.left.right.val;
                   }
               }
               if(temp.right!=null){
                   queue.add(temp.right);
                   if(temp.val%2==0){
                       if(temp.right.left!=null)
                          s+=temp.right.left.val;
                       if(temp.right.right!=null)
                          s+=temp.right.right.val;
                   }
               }
               x++;
           }
       }
        return s;
    }
}