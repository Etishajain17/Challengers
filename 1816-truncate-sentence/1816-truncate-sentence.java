class Solution {
    public String truncateSentence(String s, int k) {
        int k1=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i+1)==' ')
                k1++;
            if(k1==k)
                return s.substring(0,i+1);
        }
        return s;
    }
}