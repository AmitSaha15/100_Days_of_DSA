package Day49;

// https://leetcode.com/problems/rotate-image/

public class leetcodeQsn48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // transpose the matrix
        for (int i=0; i<n-1; i++) {
            for (int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse every row of the matrix
        for (int i=0; i<n; i++) {
            for (int j=0; j<n/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}
