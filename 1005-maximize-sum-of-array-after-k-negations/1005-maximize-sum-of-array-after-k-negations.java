class Solution {
    public int largestSumAfterKNegations(int[] nums, int k)
    {
        int s=0;
        for(int i=1;i<=k;i++)
        {
            Arrays.sort(nums);
            nums[0]=nums[0]*-1;
        }
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
        }
        
        return s;
    }
}