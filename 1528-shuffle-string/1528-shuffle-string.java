class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ca=new char[s.length()];
        for(int i=0;i<ca.length;i++)
            ca[indices[i]]=s.charAt(i);
        
        return String.valueOf(ca);
    }
}