class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            // nums1=nums2;
            for(int i=0;i<n;i++)
                nums1[i]=nums2[i];
            return;
        }
        else if(n==0)
            return;
        
        int i=0,j=0,k=0;
        int[] ar=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
                ar[k++]=nums1[i++];
            else
                ar[k++]=nums2[j++];
        }
        while(i<m)
            ar[k++]=nums1[i++];
        while(j<n)
            ar[k++]=nums2[j++];
        
        for(int a=0;a<m+n;a++)
            nums1[a]=ar[a];
        return;
    }
}