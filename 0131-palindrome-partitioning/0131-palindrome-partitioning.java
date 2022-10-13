class Solution {
    public List<List<String>> partition(String s) {
        List<String> ar= new ArrayList<String>();
        List<List<String>> ans=new ArrayList<>();
        PallinPartitionStrings2DArray(s,ar,ans);
        return ans;
    }
    public static void PallinPartitionStrings2DArray(String ques,List<String> arr,List<List<String>> ans) {
        if(ques.length()==0) {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for (int cut = 1; cut <= ques.length() ; cut++) {
            String s=ques.substring(0,cut);
            if(isPalindrome(s)) {
                arr.add(s);
                PallinPartitionStrings2DArray(ques.substring(cut), arr,ans);
                arr.remove(arr.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }   
}