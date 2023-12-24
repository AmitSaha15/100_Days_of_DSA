package Day5;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reshape-the-matrix/

public class leetcodeQsn566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums == null || nums.length == 0)
            return null;
        
        int row_nums = nums.length;
        int col_nums = nums[0].length;
        
        if(row_nums * col_nums != r * c)
            return nums;
        
        int[][] res = new int[r][c];
        List<Integer> list = new ArrayList<>();
        
        for(int[] row : nums)
        {
            for(int col : row)
            {
                list.add(col);
            }
        }
        
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                int index = i * c + j;
                res[i][j] = list.get(index);
            }
        }
        return res;
    }
}
