class Solution {
    public String modifyString(String s) {
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='?' && s.length()==1)
                return "a";
            else if(x=='?' && i==0){
                if(s.charAt(i+1)=='z')
                    s= 'a'+s.substring(1);
                else if(s.charAt(i+1)=='?')
                    s= 'a'+s.substring(1);
                else
                    s= (char)(s.charAt(i+1)+1)+s.substring(1);
            }
            else if(x=='?' && i==s.length()-1){
                if(s.charAt(i-1)=='z')
                    s= s.substring(0,s.length()-1)+'a';
                else if(s.charAt(i-1)=='?')
                    s= s.substring(0,s.length()-1)+'a';
                else
                    s= s.substring(0,s.length()-1)+(char)(s.charAt(i-1)+1);
                    
            }
            else if(x=='?'){
                for(int j=97;j<=122;j++){
                    char y=(char)(j);
                    if(y!=s.charAt(i-1) && y!=s.charAt(i+1))
                        s= s.substring(0,i)+y+s.substring(i+1);
                }
            }
        }
        return s;
    }
}