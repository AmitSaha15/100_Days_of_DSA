package Day77;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-queens/

public class leetcodeQsn51 {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        queens(board, 0, ans);
        return ans;
    }

    static void queens(char[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(display(board));
            return;
        }

        for(int col=0; col<board.length; col++){ //placing the queen and checking for every row and col
            if(isSafe(board, row, col)){ //place the queen if it's safe
                board[row][col] = 'Q';
                queens(board, row+1, ans);
                board[row][col] = '.';
            }
        }
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

    static List<String> display(char[][] board){
        List<String> temp = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String str = new String(board[i]);
            temp.add(str);
        }
        return temp;
    }
}
