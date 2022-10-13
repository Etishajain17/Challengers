class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq=new int[26];
        for (int i = 0; i < tiles.length(); i++) {
            freq[tiles.charAt(i)-'A']++;
        }
        return TilePossiblities(freq,"");
    }
    public static int TilePossiblities(int[] freq,String ans){
        int count=0;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>=1){
                char ch=(char)(i+'A');
                freq[i]--;
                count+=TilePossiblities(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return count;
    }   
}