class Solution {
    public double myPow(double x, int n) 
    {
        
        if(n==Integer.MIN_VALUE)
            return (1.0)/(x*pow(x,Math.abs(n+1)));
        if(n<0)
            return (1.0)/pow(x,Math.abs(n)); 
        return pow(x,n);
    }
    public double pow(double x, int n)
    {
        double ans = 1.0;
        while(n>0)
        {
            if(n%2==0)
            {
                x=x*x;
                n=n/2;
            }
            else
            {
                ans*=x;
                n-=1;
            }
        }
        return ans;
    }
}