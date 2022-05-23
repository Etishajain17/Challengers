class Solution {
    public int maxSubArray(int[] nums) {
     long max=nums[0],s=nums[0];
     for(int i=1;i<nums.length;i++)
     {
          if(s<0)
             s=0;
         s=s+nums[i];
         if(s>max)
             max=s;
     }
        return (int)max;
    }
}