package Day78;

// https://leetcode.com/problems/n-queens-ii/

public class leetcodeQsn52 {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        return queens(board, 0);
    }

    static int queens(char[][] board, int row) {
        if (row == board.length) {
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                count += queens(board, row + 1);
                board[row][col] = '.';
            }
        }

        return count;
    }

    static boolean isSafe(char[][] board, int row, int col){
        // check vertical row
        for (int i=0; i<row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i=1; i<=maxLeft; i++) {
            if(board[row-i][col-i] == 'Q') {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i=1; i<=maxRight; i++) {
            if(board[row-i][col+i] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
