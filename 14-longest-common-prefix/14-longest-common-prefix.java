class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String min=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(min)!=0)
            {
                min=min.substring(0,min.length()-1);
                if(min.isEmpty()) 
                    return "";
            }
        }
        return min;
    }
}