class Solution {
    public int[] prevPermOpt1(int[] arr) {
        Permutation(arr);
        return arr;
    }
    private static void Permutation(int[] arr){
        int swap1=0;
        int swap2=0;
        int f=0;
        for(int i=arr.length-1;i>=0;i--){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i] && max<arr[j]){
                    max=arr[j];
                    swap1=i;
                    swap2=j;
                    f=1;
                }
            }
            if(f==1){
                break;
            }
        }
        if(f==1){
            int temp=arr[swap1];
            arr[swap1]=arr[swap2];
            arr[swap2]=temp;
        }
    }
}