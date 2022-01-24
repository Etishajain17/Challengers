class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0)
            return false;
        int t=x,s=0;
        while(t>0)
        {
            s=s*10+(t%10);
            t=t/10;
        }
        if(s==x)
            return true;
        return false;
    }
}