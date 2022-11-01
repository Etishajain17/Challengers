class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Combination(candidates,target,list,ans,0);
        return list;
    }
    public static void Combination(int[] arr,int target,List<List<Integer>> list,List<Integer> ans,int idx){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(target>=arr[i]){
                if(ans.size()==0 || ans.get(ans.size()-1)<=arr[i]){
                    ans.add(arr[i]);
                    Combination(arr,target-arr[i],list,ans,idx);
                    ans.remove(ans.size()-1);
                }
            }
        }
    }
}