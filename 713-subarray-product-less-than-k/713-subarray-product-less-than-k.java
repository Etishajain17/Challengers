class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int c=0;
        // for (int i = 0; i < nums.length; i++) {
        //     int mul=1;
        //     int j=i;
        //     while(j<nums.length && mul*nums[j]<k){
        //         c++;
        //         mul*=nums[j++];
        //     }
        // }
        // return c;
        return productLessThanK(nums,k);
    }
    public static int productLessThanK(int[] arr,int k){
        int c=0,si=0,ei=0,product=1;
        while(ei<arr.length){
            //window grow kro
            product*=arr[ei];
            //window shrink kro
            while(product>=k && si<=ei) {
                product /= arr[si];
                si++;
            }
            //ans calculate kroooo
            c+=ei-si+1;
            ei++;
        }
    return c;
    }
}