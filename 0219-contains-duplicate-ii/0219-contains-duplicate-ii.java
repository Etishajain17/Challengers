class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        HashSet<Integer> hs=new HashSet<>();
        if(nums.length<=k)
            k=nums.length-1;
        for(int i=0;i<=k;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        for(int i=k+1;i<nums.length;i++){
            hs.remove(nums[i-k-1]);
            if(hs.contains(nums[i])){
                return true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        return false;
    }
}