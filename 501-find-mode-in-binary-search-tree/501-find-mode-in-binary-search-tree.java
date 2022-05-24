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
    // int max=0,c=1,k=0;
    // int[] ar=new int[100];
    // public int[] findMode(TreeNode root)
    // {
    //     Order(root);
    //     Inorder(root);
    //     return ;
    // }
    // public void Order(TreeNode root)
    // {
    //     if(root==null)
    //         return;
    //     if((root.left!=null && root.val==root.left.val) && (root.right!=null && root.val==root.right.val)){
    //         max=Math.max(max,++c);
    //         Order(root.left);
    //         Order(root.right);
    //     }
    //     else if(root.right!=null && root.val==root.right.val)
    //     {
    //         max=Math.max(max,++c);
    //         Order(root.right);
    //     }
    //     else if(root.left!=null && root.val==root.left.val)
    //     {
    //         max=Math.max(max,++c);
    //         Order(root.left);
    //     }
    //     else
    //     {
    //         c=1;
    //     }
    //     Order(root.left);
    //     Order(root.right);
    // }
    // public void Inorder(TreeNode root)
    // {
    //     if(root==null)
    //         return;
    //     if((root.left!=null && root.val==root.left.val) && (root.right!=null && root.val==root.right.val)){
    //         max=Math.max(max,++c);
    //         Order(root.left);
    //         Order(root.right);
    //     }
    //     else if(root.right!=null && root.val==root.right.val)
    //     {
    //         max=Math.max(max,++c);
    //         Order(root.right);
    //     }
    //     else if(root.left!=null && root.val==root.left.val)
    //     {
    //         max=Math.max(max,++c);
    //         Order(root.left);
    //     }
    //     else
    //     {
    //         if(c==max){
    //             ar[k]=root.val;
    //             k++;
    //         }
    //         c=1;     
    //     }
    //     Order(root.left);
    //     Order(root.right);
    // }
}