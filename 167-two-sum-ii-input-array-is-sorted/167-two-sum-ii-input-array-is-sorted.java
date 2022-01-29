class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        int j=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                j=i+1;
                break;
            }
        }
        if(j==-1)
             j=arr.length;
        for(int i=0;i<j;i++)
        {
           for(int k=i+1;k<j;k++)
           {
               if(arr[i]+arr[k]==target)
                   return (new int[]{i+1,k+1});
           }
        }
        return (new int[]{0,0});
    }
}