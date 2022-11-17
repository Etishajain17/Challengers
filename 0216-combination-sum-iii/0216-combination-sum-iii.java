class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Combination(k,n,list,ans,0,1);
        return list;
    }
    public static void Combination(int k,int target,List<List<Integer>> list,List<Integer> ans,int count,int idxValue){
        if(target==0 && count==k){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idxValue;i<=9;i++){
            if(target>=i && count<k){
                
                    ans.add(i);
                    Combination(k,target-i,list,ans,count+1,i+1);
                    ans.remove(ans.size()-1);
                
            }
        }
    }
}