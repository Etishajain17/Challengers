class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        subset(nums,ans,list,0);
        return list;
    }
    public static void subset(int[] nums,List<Integer> ans,List<List<Integer>> list,int index){
        if(index==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        subset(nums,ans,list,index+1);
        ans.add(nums[index]);
        subset(nums,ans,list,index+1);
        ans.remove(ans.size()-1);
    }
}