package Day12;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class leetcodeQsn1351 {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count=0;

        for(int i=0; i<r; i++){
            int start = 0;
            int end = c-1;
            while(end>=start){
                int mid = (start + end)/2;
                if(grid[i][mid]<0){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
            count += (c-start);
        }
        return count;
    }
}
