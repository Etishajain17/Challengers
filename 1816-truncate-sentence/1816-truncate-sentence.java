class Solution {
    public String truncateSentence(String s, int k) {
        if(k==s.split(" ").length)
            return s;
        String s1="";
        int k1=0;
        for(int i=0;i<s.length()-1 && k1<k;i++)
        {
            s1=s1+s.charAt(i);
            if(s.charAt(i+1)==' ')
                k1++;
        }
        return s1;
    }
}