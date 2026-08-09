class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isFound(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isFound(char[][] board,int i,int j,String word, int k){
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length|| j>=board[i].length|| word.charAt(k)!=board[i][j]){
            return false;
        }

        char temp=board[i][j];
        board[i][j]=' ';
        boolean res=(isFound(board,i+1,j,word,k+1) || isFound(board,i-1,j,word,k+1)||isFound(board,i,j+1,word,k+1)||isFound(board,i,j-1,word,k+1));

        board[i][j]=temp;

        return res;
    }
}