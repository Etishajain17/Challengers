/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
    
        int start,end,mid;
        start=1;
        end=n;
        int pos=1;
        while(start<=end)
        {
            mid= start + (end-start)/2;
            if(isBadVersion(mid)==true)
            {
                pos=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return pos;
    }
}
