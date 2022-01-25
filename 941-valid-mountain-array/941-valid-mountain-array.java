class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
        {
            return false;
        }
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                j=i;
                break;
            }    
        }
        if(j==0)
            return false;
        for(int i=j;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
                return false;
        }
        return true;
    }
}