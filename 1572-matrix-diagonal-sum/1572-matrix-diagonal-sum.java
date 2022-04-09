class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,j=mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            sum+=mat[i][i]+mat[i][j--];
        }
        if(mat.length%2==1){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}