class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls=new ArrayList<Integer>();
        long res=1;
        ls.add(1);
        for(int i=2;i<=rowIndex+1;i++){
            res*=rowIndex+1-i+1;
            res/=i-1;
            ls.add((int)res);
        }
        return ls;
    }
}