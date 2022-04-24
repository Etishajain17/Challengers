// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(long L, long R){
        // code here\
        long p=1;
        for(long i=L;i<=R;i++)
        {
            if(checkPrime(i)){
                p*=i;
                p=p%1000000007;
            }
        }
        return p%1000000007;
    }
    static boolean checkPrime(long x)
    {
        if(x==2)
           return true;
        if(x%2==0)
            return false;
        for(int i=3;i<=Math.sqrt(x);i=i+2)
        {
            if(x%i==0)
               return false;
        }
        return true;
    }
}