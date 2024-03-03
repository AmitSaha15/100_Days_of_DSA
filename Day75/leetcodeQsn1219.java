package Day75;

// https://leetcode.com/problems/path-with-maximum-gold/

public class leetcodeQsn1219 {
    int row;
    int col;
    public int getMaximumGold(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        int maxGold = 0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]>0){
                    int currSum = paths(grid, i, j);
                    maxGold = Math.max(maxGold, currSum);
                }
            }
        }

        return maxGold;
    }

    public int paths(int[][] grid, int i, int j){
        if(i<0 || i>=row || j<0 || j>= col || grid[i][j] == 0){
            return 0;
        }

        int temp = grid[i][j]; //making a copy of the current spot which has gold in it
        grid[i][j] = 0; //assign the current spots value to zero to mark that we have been
        // here before in the current iteration

        // traversing through the matrix
        int up = paths(grid, i-1, j);
        int down = paths(grid, i+1, j);
        int right = paths(grid, i, j+1);
        int left = paths(grid, i, j-1);

        grid[i][j] = temp; //now overwrite the current spots value back to the original value 
        // for the next iteration (we have changed the value before now we need to "fix"
        // the matrix values back to the original ones)

        // return the max sum of gold collected in a single iteration
        return Math.max(Math.max(up,down),Math.max(left,right)) + temp;
    }
}
