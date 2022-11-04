class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return binarySearch(letters,target);
    }
    public static char binarySearch(char[] arr,char x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        if(low>=0 && low<arr.length)
            return arr[low];
        else
            return arr[0];
    }
}