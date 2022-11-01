class Solution {
    public int getMaximumGold(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                c=Math.max(getMax(grid,i,j),c);
            }
        }
        return c;
    }
    public static int getMax(int[][] grid,int currRow,int currCol){
         if(currRow>=grid.length || currCol>=grid[0].length || currRow<0 || currCol<0)
             return 0;
        if(grid[currRow][currCol]==0){
            return 0;
        }
        int curr=grid[currRow][currCol];
        grid[currRow][currCol]=0;
        int a=curr+getMax(grid,currRow+1,currCol);
        int b=curr+getMax(grid,currRow,currCol+1);
        int c=curr+getMax(grid,currRow-1,currCol);
        int d=curr+getMax(grid,currRow,currCol-1);
        grid[currRow][currCol]=curr;
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
}