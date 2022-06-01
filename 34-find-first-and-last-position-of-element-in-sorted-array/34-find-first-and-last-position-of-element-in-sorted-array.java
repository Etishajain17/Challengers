class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,0,nums.length-1,target),last(nums,0,nums.length-1,target)};
    }
    
    public int first(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]>target)
            return first(nums,low,mid-1,target);
        else if(nums[mid]<target)
            return first(nums,mid+1,high,target);
        else{
            if(mid==0 || nums[mid]!=nums[mid-1])
                return mid;
            else
                return first(nums,low,mid-1,target);
        }
    }
    
    public int last(int[] nums,int low,int high,int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]>target)
            return last(nums,low,mid-1,target);
        else if(nums[mid]<target)
            return last(nums,mid+1,high,target);
        else{
            if(mid==nums.length-1 || nums[mid]!=nums[mid+1])
                return mid;
            else
                return last(nums,mid+1,high,target);
        }
    }
}