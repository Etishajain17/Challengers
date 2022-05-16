/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> outer= new ArrayList<>();
    Queue<Node> q = new LinkedList<>();
    
    if(root!=null)
        q.add(root);
    else
        return outer;
    
    while(!q.isEmpty())
    {
         int x = 0;
         List<Integer> inner = new ArrayList<>();
         int n = q.size();
         while(x<n)
         {
            Node temp = q.peek();
            inner.add(temp.val);
            q.remove();
            for(int i=0;i<temp.children.size();i++)
            {
                q.add(temp.children.get(i));
            }
            x++;
        }
        outer.add(inner);
    }
    return outer;
    }
}