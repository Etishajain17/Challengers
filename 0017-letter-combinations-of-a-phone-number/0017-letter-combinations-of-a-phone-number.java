class Solution {
    static String[] str={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(!digits.equals(""))
            printKeyPaid(digits,"",list);
        return list;
    }
    public static void printKeyPaid(String ques,String ans,List<String> list){
        if(ques.length()==0){
            list.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String pressString=str[ch-48];
        for(int i=0;i<pressString.length();i++){
            printKeyPaid(ques.substring(1),ans+pressString.charAt(i),list);
        }
    }
}