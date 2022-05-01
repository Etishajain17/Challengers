class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    public String check(String s)
    {
        Stack<Character> res=new Stack();
        for(char c: s.toCharArray())
        {
            if(c!='#')
                res.push(c);
            else if(!res.empty())
                res.pop();
        }
        
        return String.valueOf(res);
    }
}