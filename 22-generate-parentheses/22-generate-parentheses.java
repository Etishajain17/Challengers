class Solution {
   
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<String>();
        generate("",0,0,n,list);
        return list;
    }
    public static void generate(String ans,int open, int close, int n,List<String> list){
        if(open==n && close==n){
            list.add(ans);
            return;
        }
        
        if(open<n)
            generate(ans+"(",open+1,close,n,list);
        if(close<open)
            generate(ans+")",open,close+1,n,list);
    }
}