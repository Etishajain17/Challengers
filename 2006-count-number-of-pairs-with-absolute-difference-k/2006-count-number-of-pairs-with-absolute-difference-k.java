class Solution {
    public int countKDifference(int[] nums, int k) {
       HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            c+=hm.getOrDefault(i-k,0)+hm.getOrDefault(i+k,0);
        }
        
        return c; 
    }
}