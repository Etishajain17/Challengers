class Solution {
    public int maxVowels(String s, int k) {
        int cn=0;
        int ans=0;
        for(int i=0;i<k;i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                cn++;
            ans=Math.max(ans,cn);
        }
        for(int i=k;i<s.length();i++){
            char x=s.charAt(i);
            char y=s.charAt(i-k);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                cn++;
            if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u')
                cn--;
            ans=Math.max(ans,cn);
        }
        return ans;
    }
}