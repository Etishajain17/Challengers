class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}


 // int[] arr = new int[2*nums.length];
 //        for(int i=0;i<2*nums.length;i++)
 //        {
 //            if(i<nums.length)
 //            {
 //                arr[i]=nums[i];
 //            }
 //            else
 //            {
 //                arr[i]=nums[i-nums.length];
 //            }
 //        }