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
    List<String> l=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        bt(root,"");
        return l;
    }
    public void bt(TreeNode root,String s)
    {
        if(root!=null)
        {
            s+=Integer.toString(root.val)+"->";
            if(root.left==null && root.right==null)
            {
                l.add(s.substring(0,s.length()-2));
            }
            
            bt(root.left,s);
            bt(root.right,s);
        }
    }
}