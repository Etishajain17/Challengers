class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int top=0,bottom=n;
        int left=0,right=n;
        int j=1;
        while(top<bottom){
            for(int i=left;i<right;i++)
                arr[top][i]=j++;
            top++;
            for(int i=top;i<bottom;i++)
                arr[i][right-1]=j++;
            right--;
            for(int i=right-1;i>=left;i--)
                arr[bottom-1][i]=j++;
            bottom--;
            for(int i=bottom-1;i>=top;i--)
                arr[i][left]=j++;
            left++;
        }
        return arr;
    }
}