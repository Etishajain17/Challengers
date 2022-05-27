class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                c++;
            else{
                res=(c>res)?c:res;
                c=0;
            }
        } 
        return (c>res)?c:res;
    }
}