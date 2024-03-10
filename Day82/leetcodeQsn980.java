package Day82;

// https://leetcode.com/problems/unique-paths-iii/

public class leetcodeQsn980 {
    int m,n;
    int res;
    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int notObstacles = 0;
        int xStart = 0, yStart = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 0) notObstacles++;
                if(grid[i][j] == 1){
                    xStart = i;
                    yStart = j;
                }
            }
        }
        return backtrack(grid, notObstacles, xStart, yStart);
    }

    public int backtrack(int[][] grid, int count, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == -1) return 0;

        if(grid[i][j] == 2){
            if(count == -1) return 1;
            return 0;
        }

        grid[i][j] = -1;
        count--;
        res = backtrack(grid, count, i+1, j)+backtrack(grid, count, i, j+1)+backtrack(grid, count, i-1, j)+backtrack(grid, count, i, j-1);
        grid[i][j] = 0;
        count--;
        return res;
    }
}
