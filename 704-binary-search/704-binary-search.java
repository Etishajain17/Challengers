class Solution {
    public int search(int[] nums, int target) 
    {
        if(Arrays.binarySearch(nums,target)<0)
            return -1;
        return Arrays.binarySearch(nums,target);
        
        //**Approach**
        // int first=0,last=nums.length-1;
        // while(first<=last)
        // {
        //     int mid=(first+last)/2;
        //     if(nums[mid]==target)
        //         return mid;
        //     else if(nums[mid]<target)
        //         first=mid+1;
        //     else
        //         last=mid-1;
        // }
        // return -1;
    }
}