class Solution {
    public void sortColors(int[] nums) {
        int lo=0,mid=0,hi=nums.length-1;
        while(mid<=hi)
        {
            if(nums[mid]==0)
                swap(lo++,mid++,nums);
            else if(nums[mid]==1)
                mid++;
            else
                swap(mid,hi--,nums);
        }
    }
    public void swap(int i,int j,int[] nums)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}