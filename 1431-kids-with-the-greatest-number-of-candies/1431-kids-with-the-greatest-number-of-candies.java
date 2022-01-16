class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int max=0;
        List<Boolean> candy = new ArrayList<Boolean>();
        for(int ele:candies)
        {
            if(ele>max)
                max=ele;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                candy.add(true);
            else
                candy.add(false);
        }
        return candy;
    }
}