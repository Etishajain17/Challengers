class Solution {
    public boolean detectCapitalUse(String word) 
    {
        if(word.length()<2)
            return true;
        if(word.charAt(0)>='a' && word.charAt(0)<='z' && word.charAt(1)>='A' && word.charAt(1)<='Z')
            return false;
        char j='a';
        if(word.charAt(1)>='a' && word.charAt(1)<='z')
            j='A';
        else
            j='a';
        for(int i=2;i<word.length();i++)
        {
             if(word.charAt(i)>=j && word.charAt(i)<(j+26))
             {
                 return false;
             }
        }
        return true;
    }
}