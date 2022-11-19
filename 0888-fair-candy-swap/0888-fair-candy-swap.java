class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] res=new int[]{0,0};
        int alice=0,bob=0;
        
        Arrays.sort(bobSizes);
        
        for(int i=0;i<aliceSizes.length;i++){
            alice+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++){
            bob+=bobSizes[i];
        }
        
        for(int i=0;i<aliceSizes.length;i++){
            alice-=aliceSizes[i];
            bob+=aliceSizes[i];
            int low=0;
            int high=bobSizes.length-1;
            
            while(low<=high){
                int mid=low+(high-low)/2;
                
                alice+=bobSizes[mid];
                bob-=bobSizes[mid];
                
                if(alice == bob){
                    res[0]=aliceSizes[i];
                    res[1]=bobSizes[mid];
                    
                    return res;
                }
                else if(alice>bob)
                    high=mid-1;
                else
                    low=mid+1;
                
                alice-=bobSizes[mid];
                bob+=bobSizes[mid];
            }
            alice+=aliceSizes[i];
            bob-=aliceSizes[i];
        }
        return res;
    }
}