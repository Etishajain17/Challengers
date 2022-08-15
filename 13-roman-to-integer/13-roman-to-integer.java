class Solution {
    public int romanToInt(String s) {
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int sum=0;
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>(){{
            put('I',1);put('V',5);put('X',10);put('L',50);put('C',100);put('D',500);put('M',1000);
        }};
        for(int i=0;i<s.length();i++)
            sum+=hs.get(s.charAt(i));
        return sum;
    }
}