class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        if(nums1.length < nums2.length){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
        }
        Arrays.sort(nums1);
        for(int x: nums2){
            if(!list.contains(x) && isBinarySearch(nums1,x)){
                list.add(x);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int x:list){
            ans[i++]=x;
        }
        return ans;
    }
    public static boolean isBinarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return true;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
}