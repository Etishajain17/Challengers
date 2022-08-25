class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++)
        {
            int x=hs.getOrDefault(magazine.charAt(i),0);
            hs.put(magazine.charAt(i),x+1);
        }
        HashMap<Character,Integer> hs1=new HashMap<Character,Integer>();
        for(int i=0;i<ransomNote.length();i++){
            int x=hs1.getOrDefault(ransomNote.charAt(i),0);
            int x1=hs.getOrDefault(ransomNote.charAt(i),0);
            if(x<=x1)
                hs1.put(ransomNote.charAt(i),x+1);
            if(x+1>x1 || x1==0)
                return false;
        }
        return true;
    }
}