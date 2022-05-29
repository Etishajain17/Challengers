class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt = 0;
        int[] mark = new int[26];
        for(int i = 0; i < allowed.length(); i++){
            mark[allowed.charAt(i) - 'a'] = 1;
        }
        
        for(String word : words){
            if(ok(word, mark)) cnt++;
        }
        
        return cnt;
    }
    
    private boolean ok(String word, int[] mark){
        for(int i = 0; i < word.length(); i++){
            if(mark[word.charAt(i) - 'a'] == 0) return false;
        }
        return true;
    }
}