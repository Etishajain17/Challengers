class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
             return nums[0];
        int low=0,high=nums.length-1;
        while(high>low){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else
                high=mid;
        }
        return nums[low];
     }
}