class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        permutation(nums,ans,list);
        return list;
    }
    public static void permutation(int[] arr,List<Integer> ans,List<List<Integer>> list){
        if(ans.size()==arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!ans.contains(arr[i])){
                ans.add(arr[i]);
                permutation(arr,ans,list);
                ans.remove(ans.size()-1);
            }
        }
    }
}