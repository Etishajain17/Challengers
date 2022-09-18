class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans=new int[nums.length];
        if(nums.length<2*k+1){
            for(int i=0;i<nums.length;i++)
                ans[i]=-1;
            return ans;
        }
        long sum=0;
        for(int i=0;i<2*k+1;i++)
            sum+=nums[i];
        
        for(int i=0;i<nums.length;i++){
            if(i<k || i>nums.length-k-1)
                ans[i]=-1;
            else{
                ans[i]=(int)(sum/(2*k+1));
                if(i+k+1<nums.length)
                    sum=sum-nums[i-k]+nums[i+k+1];
            }
        }
        return ans;
    }
}