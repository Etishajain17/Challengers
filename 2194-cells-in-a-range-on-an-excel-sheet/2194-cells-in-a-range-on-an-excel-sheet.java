class Solution {
    public List<String> cellsInRange(String s) {
        List<String> l=new ArrayList<>();
        char startChar=s.charAt(0);
        int startNum=0;
        while(startChar<=s.charAt(3))
        {
            startNum=Integer.parseInt(Character.toString(s.charAt(1)));
            while(startNum<=Character.getNumericValue(s.charAt(4)))
            {
                l.add(Character.toString(startChar)+String.valueOf(startNum));
                startNum++;
            }
            startChar++;
        }
        return l;
    }
}