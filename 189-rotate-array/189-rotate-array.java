class Solution {
    public void rotate(int[] nums, int k) 
    {
       k=k%nums.length;
       reverse(nums,0,nums.length-k-1);
       reverse(nums,nums.length-k,nums.length-1);
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