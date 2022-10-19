class Solution {
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        CombinationWithoutDuplicate(candidates,target,ans,0,list);
        return list;
    }
    public static void CombinationWithoutDuplicate(int[] arr,int target,List<Integer> ans,int idx,List<List<Integer>> list){
        if(target==0){
            // System.out.println(ans);
            list.add(new ArrayList<Integer>(ans));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i!=idx && arr[i]==arr[i-1])
                continue;                                      
            if(target>=arr[i]){
                ans.add(arr[i]);
                CombinationWithoutDuplicate(arr,target-arr[i],ans,i+1,list);
                ans.remove(ans.size()-1);
            }
        }
    }
}