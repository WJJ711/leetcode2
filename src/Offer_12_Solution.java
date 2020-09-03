public class Offer_12_Solution {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (helper(board,chars,i,j,0)){
                    return true;
                }

            }
        }
        return false;
    }
    private boolean helper(char[][] board,char[] words,int i,int j,int k){
        if (i<0||i>=board.length||j<0||j>=board[0].length||words[k]!=board[i][j]||k>words.length-1){
            return false;
        }
        if (k==words.length-1){
            return true;
        }
        char tmp=board[i][j];
        board[i][j]='/';
        boolean res=(helper(board,words,i-1,j,k+1)||helper(board,words,i+1,j,k+1)||
                helper(board,words,i,j+1,k+1)||helper(board,words,i,j-1,k+1));
        board[i][j]=tmp;
        return res;
    }
}