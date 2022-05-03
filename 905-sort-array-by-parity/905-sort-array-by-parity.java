class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high)
        {
            if(nums[low]%2>nums[high]%2)
            {
                int t=nums[low];
                nums[low]=nums[high];
                nums[high]=t;
            }
            if(nums[low]%2==0) low++;
            if(nums[high]%2==1) high--;
        }
        
        return nums;
    }
}