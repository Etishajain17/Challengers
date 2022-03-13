class Solution {
    public boolean isValid(String s) 
    {
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            {
                stack.push(x);
            }
            else
            {
                if(stack.isEmpty()==true)
                {
                    return false;
                }   
                else if(isMatching(stack.peek(),x)==true)
                    stack.pop();
                else
                    return false;  
            }
        }
        return stack.isEmpty();
    }
    public boolean isMatching(char a,char b)
    {
         return((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }
       
}