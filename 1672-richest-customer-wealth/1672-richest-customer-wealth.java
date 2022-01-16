class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int max=0;
        for(var ele1:accounts)
        {
            int sum=0;
            for(int ele2:ele1)
            {
                sum=sum+ele2;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}