class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            if(arr[low]+arr[high] == target)
                return (new int[]{low+1,high+1});
            else if(arr[low] + arr[high] < target)
                 low++;
            else
                high--; 
        }
        return (new int[]{low+1,high+1});
    }
}