class Solution {
    public void rotate(int[] nums, int k) 
    {
       k=k%nums.length;
        k=nums.length-k-1;
       reverse(nums,0,k);
       reverse(nums,k+1,nums.length-1);
       reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}