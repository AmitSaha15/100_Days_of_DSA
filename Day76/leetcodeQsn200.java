package Day76;

// https://leetcode.com/problems/number-of-islands/

public class leetcodeQsn200 {
    int rows, cols;
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int islands = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void dfs(char[][] grid, int r, int c) {
        if (r<0 || c<0 || r>=rows || c>=cols || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r, c+1);
        dfs(grid, r-1, c);
        dfs(grid, r, c-1);
    }
}
