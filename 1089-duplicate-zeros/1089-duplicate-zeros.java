class Solution {
    public void duplicateZeros(int[] arr) {
        
        int eli= arr.length-1,  cli = eli ;
        
        for (int l=0 ; l <= eli ; l++){
            if (arr[l]==0){
                if(eli==l){
                    arr[cli--]=0;                
                }
                eli--;
            }
        }
        
        for(int i = cli, j = eli ; j >= 0; j--){
            arr[i--] = arr[j];  
            if (arr[j]==0){
                arr[i--] = arr[j];
            }
        }        
    }
}



// class Solution {
//     public void duplicateZeros(int[] arr) {
//         int c=0;
//         int[] arr1=new int[arr.length];
//         for(int i=0;i<arr.length && c<arr.length;i++){
            
//             arr1[c]=arr[i];
//             c++;
//             if(c>=arr.length)
//                 break;
//             if(arr[i]==0){
//                 arr1[c]=0;
//                 c++;
                
//             } 
            
//         }
//         for(int i=0;i<arr.length;i++)
//             arr[i]=arr1[i];
//     }
// }