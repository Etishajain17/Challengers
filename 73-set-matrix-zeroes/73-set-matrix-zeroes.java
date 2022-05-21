class Solution {
    HashSet<Integer> hs1=new HashSet<>();
    HashSet<Integer> hs2=new HashSet<>();
    public void setZeroes(int[][] matrix) 
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(!hs1.contains(i))
                        hs1.add(i);
                    if(!hs2.contains(j))
                        hs2.add(j);
                }    
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
               if(hs1.contains(i) || hs2.contains(j))
               {
                  matrix[i][j]=0;
               }
            }
        }
    }
}