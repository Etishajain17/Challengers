class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=i,k=0;
                while(i<haystack.length() && k<needle.length()
                     && haystack.charAt(i)==needle.charAt(k)){
                    i++;
                    k++;
                }
                if(k==needle.length())
                    return j;
                i=j;
                k=0;
            }
        }
        return -1;
    }
}
