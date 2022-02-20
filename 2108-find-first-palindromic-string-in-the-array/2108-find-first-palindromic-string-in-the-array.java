class Solution {
    public String firstPalindrome(String[] words) 
    {
        for(int i=0;i<words.length;i++)
        {
            int l=0,h=words[i].length()-1;
            while(l<h)
            {
                if(words[i].charAt(l)!=words[i].charAt(h))
                    break;
                l++;
                h--;
            }
            if(l==words[i].length()/2)
            {
                return words[i];
            }
        }
        return "";
    }
}