package Day10;

import java.util.Arrays;

public class leetcodeQsn73 {

    // Brute force ---> Time: O((mn)∗(m+n)), Space: O(mn)

    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;

    //     // make a copy of the original matrix
    //     int[][] copy = new int[m][n];
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             copy[i][j] = matrix[i][j];
    //         }
    //     }

    //     // if any element in the original matrix is zero make the req. change in the copy
    //     for(int i=0; i<m;i++){
    //         for(int j=0; j<n; j++){
    //             if(matrix[i][j] == 0){
    //                 // all cols of copy set to zero
    //                 for(int k=0; k<m; k++){
    //                     copy[k][j] = 0;
    //                 }
    //                 // all rows of copy set to zero
    //                 for(int k=0; k<n; k++){
    //                     copy[i][k] = 0;
    //                 }
    //             }
    //         }
    //     }


    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             matrix[i][j] = copy[i][j];
    //         }
    //     }
    // }


    // more optimized --> Time: O(mn), Space: O(m+n)

    // public void setZeroes(int[][] matrix){
    //     int m = matrix.length;
    //     int n = matrix[0].length;

    //     // taking two arrays to store which column and row needs to be set to zero
    //     int[] row = new int[m];
    //     int[] col = new int[n];
    //     Arrays.fill(row,1);
    //     Arrays.fill(col,1);

    //     // traversing the matrix to find 0, the will update the row[] & col[]
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             if(matrix[i][j] == 0){
    //                 row[i] = 0;
    //                 col[j] = 0;
    //             }
    //         }
    //     }

    //     // making changes in the original array according to row[] & col[]
    //     for(int i=0; i<m; i++){
    //         for(int j=0; j<n; j++){
    //             if(row[i] == 0 || col[j] == 0){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }



    // O(1) space approach

    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;

        // traversing the matrix to determine which row/col needs to be zero
        // here instead of taking two diff arrays we are taking the 0th row and 0th col
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    } else{
                        col0 = 0;
                    }
                }

            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // for the 0th row
        if(matrix[0][0] == 0){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        // for 0th col
        if(col0 == 0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }

}
