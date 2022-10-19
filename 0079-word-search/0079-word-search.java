class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)) {
                    if(WordSearch(board, word, 0,i,j) == true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean WordSearch(char[][] arr,String s,int idx,int cr,int cc){
        if(idx==s.length()){
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || arr[cr][cc]!=s.charAt(idx)){
            return false;
        }
        arr[cr][cc]='*';
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        boolean possible=false;
        for (int i = 0; i < c.length; i++) {
            possible=possible || WordSearch(arr,s,idx+1,cr+r[i],cc+c[i]);
        }
        arr[cr][cc]=s.charAt(idx);
        return possible;
    }
}