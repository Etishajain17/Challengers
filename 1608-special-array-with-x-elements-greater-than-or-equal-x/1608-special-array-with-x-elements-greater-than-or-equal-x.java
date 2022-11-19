class Solution {
    public int specialArray(int[] nums) {
        int low=1,high=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(count(mid,nums)==mid){
                return mid;
            }
            else if(count(mid,nums)<mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int count(int mid,int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=mid)
                count++;
        }
        return count;
    }
}