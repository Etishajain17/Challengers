class Solution {
    public String replaceDigits(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                s1.append((char)(s.charAt(i-1) + Character.getNumericValue(s.charAt(i))));
            else
                s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}