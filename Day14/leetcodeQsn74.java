package Day14;

// https://leetcode.com/problems/search-a-2d-matrix/

public class leetcodeQsn74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;
        while (r<matrix.length && c>=0) {
            if (matrix[r][c] == target) {
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            } else{
                c--;
            }
        }
        return false;
    }
}
