class Solution {
    public String removeDuplicates(String s) {
        if(s.length()==1)
            return s;
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(stack.peek()==null)
                stack.push(s.charAt(i));
            else if(stack.peek()!=s.charAt(i))
                stack.push(s.charAt(i));
            else
                stack.pop();
        }
        s="";
        while(stack.peek()!=null)
        {
            s=s+stack.peek();
            stack.pop();
        }
        return s;
    }
}