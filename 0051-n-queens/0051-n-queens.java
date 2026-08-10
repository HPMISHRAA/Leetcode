class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }
        findSolution(0, ans, board);
        return ans;
    }

    public static void findSolution(int row, List<List<String>> ans, List<String> board) {
        if (row == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < board.get(0).length(); col++) {
            if (isSafe(row, col, board)) {
                char[] rowArray = board.get(row).toCharArray();
                rowArray[col] = 'Q';
                board.set(row, new String(rowArray));

                findSolution(row + 1, ans, board);
                rowArray[col] = '.';
                board.set(row, new String(rowArray));
            }
        }
    }

    public static boolean isSafe(int row,int col,List<String> board){
        int r=row,c=col;
        while(r>=0 && c>=0){
            if(board.get(r).charAt(c)=='Q'){
                return false;
            }
            r--;c--;
        }
        r=row;c=col;
        while(r>=0){
            if(board.get(r).charAt(c)=='Q'){
            return false;
        }
        r--;
        }
        r=row;c=col;
        while(r>=0 && c<board.get(0).length()){
            if(board.get(r).charAt(c)=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
        
    }
}