class Solution {
    public int largestAltitude(int[] gain) 
    {
        int highest=0;
        int altitude=0;
        for(int i=0;i<gain.length;i++)
        {
            altitude=altitude+gain[i];
            if(altitude>highest)
                highest=altitude;
        }
        return highest;
    }
}