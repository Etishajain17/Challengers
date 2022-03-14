class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int max=sentences[0].split(" ").length;
        
        for(int i=1;i<sentences.length;i++)
            max=Math.max(max,sentences[i].split(" ").length);
            
        return max;
    }
}