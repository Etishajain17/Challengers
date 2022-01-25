class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] ar=new int[2];
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(target-nums[i]))
            {
                ar[0]=i;ar[1]=m.get(target-nums[i]);
                break;
            }
            m.put(nums[i],i);
        }
        return ar;
    }
}