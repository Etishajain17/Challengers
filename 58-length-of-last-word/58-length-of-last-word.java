class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                c++;
            else if(c>0)
                return c;
        }
        return c;
    }
}