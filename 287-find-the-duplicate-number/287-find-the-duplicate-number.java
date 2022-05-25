class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]))
                hs.add(nums[i]);
            else
                return nums[i];
        }
        
        return nums[nums.length-1];
    }
}