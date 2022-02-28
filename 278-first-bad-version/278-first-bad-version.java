/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        int beg,last,mid;
        beg=1;
        last=n;
        int pos=1;
        while(beg<=last)
        {
            mid= beg + (last-beg)/2;
            boolean x=isBadVersion(mid);
            if(x==true)
            {
                pos=mid;
                last=mid-1;
            }
            else
                beg=mid+1;
        }
        return pos;
    }
}
