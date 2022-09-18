class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0,ei=0,sum=0,ans=Integer.MAX_VALUE;
        while(ei<nums.length){
            sum+=nums[ei];
            while(sum-nums[si]>=target){
                sum-=nums[si];
                si++;
            }
            if(sum>=target)
                ans=Math.min(ans,ei-si+1);
            ei++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}