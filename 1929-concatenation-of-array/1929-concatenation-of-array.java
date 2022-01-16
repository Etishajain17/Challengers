class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n=nums.length+nums.length;
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            // best step
            ans[i]=ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}