class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int n=1;
        int c=0;
        while(true){
            if(i<arr.length && arr[i]==n && c<k){
                i++;
                n++;
            }
            else if(c==k){
                return n-1;
            }
            else{
                n++;
                c++;
            }
        }
    }
}