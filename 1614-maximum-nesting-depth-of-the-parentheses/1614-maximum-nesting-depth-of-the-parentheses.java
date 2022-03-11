class Solution {
    public int maxDepth(String s) {
        int maxv=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                maxv++;
            else if(s.charAt(i)==')')
                maxv--;
            if(maxv>max)
                max=maxv;
        }
        return max;
    }
}