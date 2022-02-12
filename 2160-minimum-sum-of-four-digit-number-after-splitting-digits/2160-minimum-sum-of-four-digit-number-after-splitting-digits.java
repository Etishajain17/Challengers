class Solution 
{
    public int minimumSum(int num) 
    {
        int[] ar=new int[4];
        for(int i=0;i<4;i++)
        {
            ar[i]=num%10;
            num=num/10;
        }
        Arrays.sort(ar);
        
        return ar[0]*10+ar[3]+ar[1]*10+ar[2];
    }
}