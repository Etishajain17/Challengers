class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashSet<Character> hs=new HashSet<>();
        s+=s.charAt(s.length()-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                int j=i;
                while(j<s.length() && !hs.contains(s.charAt(j))){
                   hs.add(s.charAt(j));
                   j++;
                }
                if(ans<hs.size())
                   ans=hs.size();
                hs.clear();
            }
            else{
               hs.clear();
               hs.add(s.charAt(i));
            }
        }
        return ans;
    }
}