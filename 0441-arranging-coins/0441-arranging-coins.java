class Solution {
    public int arrangeCoins(int n) {
        long sum=0;
        int i=1;
        while(i+sum<=n){
            sum+=i;
            i++;
        }
        return i-1;
    }
}