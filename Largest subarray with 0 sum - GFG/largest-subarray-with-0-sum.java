// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]==0 && max==0)
                max=1;
            if(sum==0)
                max=i+1;
            Integer prev=hs.get(sum);
            
            if(prev!=null)
                max=Math.max(max,i-prev);
            else
                hs.put(sum,i);
        }
        return max;
    }
}