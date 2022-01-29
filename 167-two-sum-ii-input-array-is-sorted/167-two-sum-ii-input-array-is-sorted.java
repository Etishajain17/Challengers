class Solution {
    public int[] twoSum(int[] arr, int target) 
    {
        int low = 0, high = arr.length-1;
        int[] out = new int[2];
        
        while(low <= high){
            
            if(arr[low]+arr[high] == target){
                out[0] = low+1;
                out[1] = high+1;
                return out;
            }
            
            else if(arr[low] + arr[high] < target){
                low++;
            }
            
            else{
                high--;
            }    
        }
        
        return out;
    }
}