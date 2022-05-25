class Solution {
    public int majorityElement(int[] nums) {
        int res=0,count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[res]==nums[i])
                count++;
            else
                count--;
            if(count==0){
                count=1;
                res=i;
            }
        }
        
        return nums[res];
    }
}