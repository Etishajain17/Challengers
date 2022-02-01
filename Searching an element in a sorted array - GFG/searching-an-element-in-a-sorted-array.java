// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.searchInSorted(arr, n, k));
        }
    }
}// } Driver Code Ends


class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int low=0,high=N-1;
       while(low<=high)
       {
           int mid=(low+high)/2;
           if(arr[mid]<K)
               low=mid+1;
           else if(arr[mid]>K)
               high=mid-1;
           else
               return 1;
       }
       return -1;
        
    }
}