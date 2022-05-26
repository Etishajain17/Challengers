class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
            hs.add(num);
            
        int ans=0;
        for(int num:hs)
        {
            if(!hs.contains(num-1))
            {
                int cu=num;
                int cs=1;
                while(hs.contains(cu+1))
                {
                    cu+=1;
                    cs+=1;
                }
                ans=Math.max(ans,cs);
            }
        }
        return ans;
    }
}