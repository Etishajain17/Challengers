class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            int mul=1;
            int j=i;
            while(j<nums.length && mul*nums[j]<k){
                c++;
                mul*=nums[j++];
            }
        }
        return c;
    }
}