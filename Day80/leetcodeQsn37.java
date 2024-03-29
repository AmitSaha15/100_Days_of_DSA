package Day80;

// https://leetcode.com/problems/sudoku-solver/

public class leetcodeQsn37 {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmptyRem = true;

        // replacing the row,col from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    isEmptyRem = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if (isEmptyRem == false) {
                break;
            }
        }

        if (isEmptyRem == true) {
            return true;
            // soduko is solved
        }

        // backtrack
        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (char[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;
            }
        }

        // check the 3x3 sub-boxes of the grid
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
