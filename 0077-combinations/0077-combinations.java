class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Combinations(n,k,1,ans,list,0);
        return list;
    }
    public static void Combinations(int n,int k,int idx,List<Integer> ans, List<List<Integer>> list,int c){
        if(c==k){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<=n;i++){
            ans.add(i);
            Combinations(n,k,i+1,ans,list,c+1);
            ans.remove(ans.size()-1);
        }
    }
}