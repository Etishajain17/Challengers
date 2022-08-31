class Solution 
{
    public int trap(int[] height) 
    {
        int[] r=new int[height.length];
        int[] l=new int[height.length];
        int max1=height[0],max2=height[height.length-1],s=0;
        for(int i=0,j=height.length-1;i<height.length && j>=0;i++,j--)
        {
            l[i]=max1;
            max1=Math.max(max1,height[i]);
            r[j]=max2;
            max2=Math.max(max2,height[j]);
        }
        for(int i=0;i<height.length;i++)
        {
            System.out.println(l[i]+" "+r[i]);
            if(height[i]<Math.min(l[i],r[i]))
                s=s+Math.min(l[i],r[i])-height[i];
        }
        return s;
    }
}