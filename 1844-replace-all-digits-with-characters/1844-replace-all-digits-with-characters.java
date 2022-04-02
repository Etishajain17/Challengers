class Solution {
    public String replaceDigits(String s) {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                char z=(char)(s.charAt(i-1) + Character.getNumericValue(s.charAt(i)));
                s1=s1+z;
            }
            else
                s1=s1+s.charAt(i);
        }
        return s1;
    }
}