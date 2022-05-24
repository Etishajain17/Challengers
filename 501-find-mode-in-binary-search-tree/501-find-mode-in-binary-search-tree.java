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
    HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
    public int[] findMode(TreeNode root)
    {
        inorder(root);
        int c=0,i=0;
        int max=Collections.max(hs.values());
        for(Map.Entry map : hs.entrySet()) {
            if(map.getValue()==Integer.valueOf(max))
                c++;
        }
        int[] arr=new int[c];
        for(Map.Entry map : hs.entrySet()) {
            if(map.getValue()==Integer.valueOf(max))
                arr[i++]=(int)(map.getKey());
        }
        return arr;
    }
    public void inorder(TreeNode root)
    {
        if(root!=null)
        {
            inorder(root.left);
            int c=hs.getOrDefault(root.val,0);
            hs.put(root.val,c+1);
            inorder(root.right);
        }
    }
}