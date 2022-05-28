class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hs1.put(s.charAt(i),hs1.getOrDefault(s.charAt(i),0)+1);
            hs2.put(t.charAt(i),hs2.getOrDefault(t.charAt(i),0)+1);
        }
        if(hs1.size()!=hs2.size())
            return false;
        for(Map.Entry<Character,Integer> map :hs1.entrySet()){
            if(hs2.containsKey(map.getKey()) && (int)(map.getValue())==(int)(hs2.get(map.getKey())))
                continue;
            return false;
        }
        return true;
    }
}