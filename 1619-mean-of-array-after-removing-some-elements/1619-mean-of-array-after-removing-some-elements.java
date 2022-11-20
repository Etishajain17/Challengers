class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int x=(int)(0.05*arr.length);
        double sum=0;
        for(int i=x;i<arr.length-x;i++){
            sum+=(double)(arr[i])/(arr.length-2*x);
        }
        return sum;
    }
}