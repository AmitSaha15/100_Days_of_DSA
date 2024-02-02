package Day45;

// https://leetcode.com/problems/word-search/

public class leetcodeQsn79 {
    boolean[][] visited; // to keep track of the cells that are already visited
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        visited = new boolean[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                // when the first char of the word is found search the other chars
                // with recursive call
                if(word.charAt(0) == board[i][j] && search(i, j, board, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(int i, int j, char[][] board, String word, int index){
        if(index == word.length()) return true;

        // boundary checks
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || board[i][j]!=word.charAt(index) || visited[i][j]){
            return false;
        }

        visited[i][j] = true;
        // recursive calls to find chars in up,down,right and left directions
        boolean check1 = search(i+1, j, board, word, index+1);
        boolean check2 = search(i-1, j, board, word, index+1);
        boolean check3 = search(i, j+1, board, word, index+1);
        boolean check4 = search(i, j-1, board, word, index+1);
        visited[i][j] = false;

        return check1 || check2 || check3 || check4;
    }
}
