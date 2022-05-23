class Solution {
    public int maxProfit(int[] prices) {
//         int mini=0,maxi=prices.length-1,i=0,j=prices.length-1;
//         while(i>0)
//         {
//             if(prices[i]<prices[mini])
//                 mini=i;
//             if(prices[maxi]>prices[i]-prices[mini])
//                 maxi=i;
//             i++;
//         }
//         return prices[maxi];
    
    int max = 0;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      max = Math.max(max, prices[i] - min);
    }
    return max;
    }
}