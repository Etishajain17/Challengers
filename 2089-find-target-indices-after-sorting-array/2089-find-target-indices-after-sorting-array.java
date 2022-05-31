class Solution {
    List<Integer> arr=new ArrayList<Integer>();
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        help(nums,0,nums.length-1,target);
        Collections.sort(arr);
        return arr;
        
    }
    public void help(int[] nums,int i,int j,int tar){
        if(i>j) return;
        int mid=(i+j)/2;
        if(nums[mid]==tar)
            arr.add(mid);
        help(nums,i,mid-1,tar);
        help(nums,mid+1,j,tar);
    }
}