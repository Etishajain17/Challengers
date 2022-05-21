class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ar=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> list=new ArrayList<Integer>(i+1);
            for(int j=0;j<i+1;j++)
            {
                if(j==0 || j==i)
                    list.add(j,1);
                else
                {
                    list.add(j,ar.get(i-1).get(j-1)+ar.get(i-1).get(j));
                }
            }
            ar.add(list);
        }
        return ar;
    }
}