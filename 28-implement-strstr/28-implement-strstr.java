class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                while((i+j)<haystack.length() && j<needle.length()
                     && haystack.charAt(i+j)==needle.charAt(j)){
                    j++;
                }
                if(j==needle.length())
                    return i;
            }
        }
        
        return -1;
    }
}
