package Day4;

// https://leetcode.com/problems/matrix-diagonal-sum/

public class leetcodeQsn1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    primaryDiagonalSum += mat[i][j];
                }
                if((i+j) == (n-1)){
                    secondaryDiagonalSum += mat[i][j];
                }
            }
        }

        int ans = (primaryDiagonalSum + secondaryDiagonalSum);
        if(n%2 != 0){
            ans = ans - mat[n/2][n/2];
        }

        return ans;
    }
}
