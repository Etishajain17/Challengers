class Solution {
    public String reversePrefix(String word, char ch) {
        int l=0,h=word.indexOf(ch);
        if(l<h)
        word=word.charAt(h)+word.substring(l+1,h)+word.charAt(l)+word.substring(h+1);
        while(++l<--h)
        {
            word=word.substring(0,l)+word.charAt(h)+word.substring(l+1,h)+word.charAt(l)+word.substring(h+1); 
        }
        return word;
    }
}