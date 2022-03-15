class Solution {
    public int balancedStringSplit(String s) {
        int subLen = 0,c = 0;
        for(int i=0;i<s.length();i++){
            subLen= s.charAt(i)=='R'?(subLen+1):(subLen-1);
            if(subLen==0){
               c++;
            }
        }
    return c;
    }
}