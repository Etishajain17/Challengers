class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        if(sentence.length()<26)
        {
            System.out.println("hm");
            return false;
        }
        for(int i=0;i<26;i++)
        {
            if(sentence.contains(Character.toString('a'+i))==false)
            {
                return false;
            }
        }
        return true;
    }
}