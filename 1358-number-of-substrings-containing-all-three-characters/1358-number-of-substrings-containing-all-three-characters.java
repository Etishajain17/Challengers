class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0,si=0,ei=0,ca=0,cb=0,cc=0;
        while(ei<s.length()){
            if(s.charAt(ei)=='a')
                ca++;
            else if(s.charAt(ei)=='b')
                cb++;
            else
                cc++;
            while(ca>=1 && cb>=1 && cc>=1 && si<=ei){
                if(s.charAt(si)=='a'){
                    ca--;
                }
                else if(s.charAt(si)=='b'){
                    cb--;
                }
                else{
                    cc--;
                }
                ans+=s.length()-ei;
                si++;
            }
            
            ei++;
        }
        return ans;
    }
}