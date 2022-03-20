class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (numericValue(firstWord)+numericValue(secondWord)==numericValue(targetWord));
    }
    private int numericValue(String s)
    {
        int numValue=0;
        for(int i=0;i<s.length();i++)
        {
            numValue=numValue*10 + s.charAt(i)-'a';
        }
        return numValue;
    }
}