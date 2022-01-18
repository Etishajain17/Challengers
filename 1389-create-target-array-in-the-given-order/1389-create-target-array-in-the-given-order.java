class Solution {
    public int[] createTargetArray(int[] nums, int[] index) 
    {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i]=-1;
        }
        for(int i=0;i<index.length;i++)
        {
            if(target[index[i]]==-1)
            {
                target[index[i]]=nums[i];
            }
            else
            {
                for(int j=target.length-1;j>index[i];j--)
                {
                    target[j]=target[j-1];
                }
                target[index[i]]=nums[i];
            }
        }
        return target;
    }
}