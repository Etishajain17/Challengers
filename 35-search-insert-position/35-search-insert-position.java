class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        
        if(Arrays.binarySearch(nums,target)>-1)
        {
            return Arrays.binarySearch(nums,target);
        }
        else
        {
            return Math.abs(Arrays.binarySearch(nums,target))-1;
        }
        
        //**Approach**
        // int first=0,last=nums.length-1;
        // while(first<last)
        // {
        //     int mid=(first+last)/2;
        //     if(nums[mid]==target)
        //         return mid;
        //     else if(nums[mid]>target)
        //         last=mid-1;
        //     else
        //         first=mid+1;
        // }
        // if(target<=nums[first])
        // {
        //     return first;
        // }
        // else
        // {
        //     return first+1;
        // }
    }
}