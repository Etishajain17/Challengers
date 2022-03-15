class Solution 
{
    public String sortSentence(String s) 
    {
        int j=0,i=0;
        String[] str=s.split(" ");
        for(i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i+1)==' ')
            {
                str[Character.getNumericValue(s.charAt(i))-1]=s.substring(j,i);
                j=i+2;
            }
        }
        str[Character.getNumericValue(s.charAt(i+1))-1]=s.substring(j,i+1);
        return String.join(" ", str);
    }
}