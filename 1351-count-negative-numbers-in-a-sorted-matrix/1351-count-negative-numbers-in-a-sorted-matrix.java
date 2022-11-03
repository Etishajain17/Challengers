class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] arr:grid){
            int low=0;
            int high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]>=0)
                    low=mid+1;
                else
                    high=mid-1;
            }
            count+=arr.length-high-1;
        }
        return count;
    }
}