class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int[] ar=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i=i+2)
        {
            ar[i]=nums[j];
            ar[i+1]=nums[j+n];
            j++;
        }
        return ar;
    }
}