class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int j=0;
        int count=0;
        switch(ruleKey)
        {
                case "type" -> j=0;
                case "color" -> j=1;
                default -> j=2;
        }
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).get(j).equals(ruleValue))
                count++;
        }
        return count;
    }
}