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
        if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length){
            return false;
        }
        boolean possible=false;
        if(arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx) || arr[cr][cc]==s.charAt(idx)){
            char t=arr[cr][cc];
            arr[cr][cc]='0';
            possible=possible || WordSearch(arr,s,idx+1,cr,cc-1);
            possible=possible || WordSearch(arr,s,idx+1,cr,cc+1);
            possible=possible || WordSearch(arr,s,idx+1,cr-1,cc);
            possible=possible || WordSearch(arr,s,idx+1,cr+1,cc);
            arr[cr][cc]=t;
        }
        return possible;
    }
}