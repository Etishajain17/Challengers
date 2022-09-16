class Solution {
    public int longestSubarray(int[] nums) {
        int c=0,ans=0,si=0,ei=0;
        while(ei<nums.length){
            if(nums[ei]==0)
                c++;
            while(c>1){
                if(nums[si]==0)
                    c--;
                si++;
            }
            ans=Math.max(ans,ei-si);
            ei++;
        }
        return ans;
    }
}