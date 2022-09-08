class Solution {
    public String reverseWords(String s) {
	    // s=s+" ";
	    // int left = 0,right = s.length() - 1,c=0;
	    // String temp = "",ans = "";
	    // while (left<=right)
	    // {
	    // char ch = s.charAt(left);
	    // if (ch != ' '){
	    // temp += ch;
	    // c=0;
	    // }
	    // else if (ch == ' ' && c==0){
	    // c=1;
	    // ans = temp + " " + ans;
	    // temp = "";
	    // }
	    // left++;
	    // }
	    // return ans.trim();
        s=s.trim();
        String[] arr=s.split("\s+");
        String ans="";
        for(int i=arr.length-1;i>=0;i--)
            ans+=arr[i]+" ";
        return ans.trim();
    }
}