class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0,ei=0,sum=0,ans=Integer.MAX_VALUE;
        while(ei<nums.length){
            sum+=nums[ei];
            while(si<=ei && sum>=target){
                ans=Math.min(ans,ei-si+1);
                System.out.println(ei-si+" "+ans);
                sum-=nums[si];
                si++;
            }
            ei++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}