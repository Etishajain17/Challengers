class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> arr=new ArrayList<>();
        Permutation(s,"",arr);
        return arr;
    }
    public static void Permutation(String ques,String ans,List<String> list){
        if(ques.length()==0){
            list.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        if(Character.isLetter(ch)){
            Permutation(ques.substring(1),ans+Character.toLowerCase(ch),list);
            Permutation(ques.substring(1),ans+Character.toUpperCase(ch),list);
        }
        else{
            Permutation(ques.substring(1),ans+ch,list);
        }
    }
}