package Day7;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/

public class leetcodeQsn54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0){
            return new ArrayList<>();
        }

        int row1 = 0, row2 = m-1; //boundary rows
        int col1 = 0, col2 = n-1; //boundary cols

        while(ans.size() < m*n){
            for(int i=col1; i<=col2 && ans.size() < m*n; i++){
                ans.add(matrix[row1][i]);
            }
            for(int j=row1+1; j<=row2-1 && ans.size() < m*n; j++){
                ans.add(matrix[j][col2]);
            }
            for (int i = col2; i >= col1 && ans.size() < m*n; i--){
                ans.add(matrix[row2][i]);
            }
            for (int j = row2-1; j>=row1+1 && ans.size() < m*n; j--){
                ans.add(matrix[j][col1]);
            }
            row1++;
            row2--;
            col1++;
            col2--;
        }

        return ans;
    }
}
