class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        float[] num=new float[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                num[k]=nums1[i];
                i++;
            }
            else
            {
                num[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length)
        {
            num[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            num[k]=nums2[j];
            j++;
            k++;
        }
        if((nums1.length+nums2.length)%2==0)
            return (num[(nums1.length+nums2.length)/2]+num[((nums1.length+nums2.length)/2)-1])/2;
        else
            return num[(nums1.length+nums2.length)/2];
    }
}