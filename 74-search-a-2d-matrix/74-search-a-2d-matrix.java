class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        for(i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target)
                break;
        }
        if(i==matrix.length)
            return false;
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==target)
                return true;
        }
        return false;
    }
}