class Solution {
    public int minPartitions(String n) {
       int max=0;
       for(int i=0;i<n.length();i++)
       {
           if(max<Character.getNumericValue(n.charAt(i)))
               max=Character.getNumericValue(n.charAt(i));
           if(max==9)
               return max;
       }
       return max;
    }
}