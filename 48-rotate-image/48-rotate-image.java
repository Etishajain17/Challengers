class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            
        }
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }
    }
    public void reverse(int[] arr)
    {
        int lo=0,hi=arr.length-1;
        while(lo<hi)
        {
            int t=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=t;
            lo++;hi--;
        }
    }
}