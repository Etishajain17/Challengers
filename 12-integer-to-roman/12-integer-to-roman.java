class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> hs=new HashMap<Integer,String>(){{
           put(1,"I");put(4,"IV");put(5,"V");put(9,"IX");put(10,"X");put(40,"XL");put(50,"L");put(90,"XC");put(100,"C");
            put(400,"CD");put(500,"D");put(900,"CM");put(1000,"M");
        }};
        String s="";
        int x=0;
        while(num>0){
            if(num>=1000)
                x=1000;
            else if(num>=900)
                x=900;
            else if(num>=500)
                x=500;
            else if(num>=400)
                x=400;
            else if(num>=100)
                x=100;
            else if(num>=90)
                x=90;
            else if(num>=50)
                x=50;
            else if(num>=40)
                x=40;
            else if(num>=10)
                x=10;
            else if(num>=9)
                x=9;
            else if(num>=5)
                x=5;
            else if(num>=4)
               x=4;
            else
                x=1;
            s+=hs.get(x);
            num-=x;
        }
        return s;
    }
}