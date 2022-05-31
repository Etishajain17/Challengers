class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList();
        int pos = 0,count = 0;
        for(int i: nums){
            if(i == target)
                count++;
            if(i < target)
                pos++;
        }
        for(int i=0; i<count; i++)
            arr.add(pos+i);
        
        return arr;
    }
}