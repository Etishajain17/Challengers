class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
     int sum=0;
     for(int i=0;i<arr.length;i++){
         sum+=arr[i]*count(i,arr.length);
     }
     return sum;
    }
    private int count(int i, int n) {
        int leftOdd = ((i + 1) / 2);
        int rightOdd = ((n - i) / 2);
        int leftEven = i - leftOdd + 1;
        int rightEven = n - i - rightOdd;
        return leftOdd * rightOdd + leftEven * rightEven;
    }
}