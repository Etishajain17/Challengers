class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        boolean[] arr=new boolean[26];
        if(sentence.length()<26)
        {
            System.out.println("hm");
            return false;
        }
        for(int i=0;i<26;i++)
        {
            arr[i]=sentence.contains(Character.toString((char)('a'+i)));
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==false)
            {
                return false;
            }
        }
        return true;
    }
}