class Solution {
    public List<String> buildArray(int[] target, int n) 
    {
        List<String> l=new ArrayList<>();
        int i=0,j=1;
        while(i<target.length && j!=n+1)
        {
            if(target[i]==j)
            {
                l.add("Push");
                i++;
                j++;
            }
            else
            {
                l.add("Push");
                l.add("Pop");
                j++;
            }
        }
        return l;
    }
}