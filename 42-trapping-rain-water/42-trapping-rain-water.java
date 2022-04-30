class Solution 
{
    public int trap(int[] height) 
    {
        int[] r=new int[height.length];
        int[] l=new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++)
        {
            l[i]=max;
            max=Math.max(max,height[i]);
        }
        max=0;
        for(int i=height.length-1;i>=0;i--)
        {
            r[i]=max;
            max=Math.max(max,height[i]);
        }
        int s=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]<Math.min(l[i],r[i]))
                s=s+Math.min(l[i],r[i])-height[i];
        }
        return s;
    }
}