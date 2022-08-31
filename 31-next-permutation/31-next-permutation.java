class Solution {
    public static void reverse(int[] arr,int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public void nextPermutation(int[] arr) {
        int p=0;
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]<arr[i+1])
            {
                p=i;
                break;
            }
        }

        int q=0;
        for (int i = arr.length-1; i > p; i--) {
            if(arr[i]>arr[p]) {
                q = i;
                break;
            }
        }
        if(p==0 && q==0) {
            reverse(arr, 0, arr.length-1);
            return;
        }
        
        //Swap p and q index
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr,p+1,arr.length-1);
    }
    
}
