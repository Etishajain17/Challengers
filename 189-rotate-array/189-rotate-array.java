class Solution {
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;
        reverseArrayByParts(0,nums.length-k-1,nums);
        reverseArrayByParts(nums.length-k,nums.length-1,nums);
        reverseArrayByParts(0,nums.length-1,nums);
    }
    
    //method to just reverse
    void reverseArrayByParts(int low,int high,int[] nums)
    {
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    } 
}