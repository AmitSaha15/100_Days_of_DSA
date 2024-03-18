package Day90;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

public class leetcodeQsn452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[0],b[0])); //sort the array by starting point

        int[] prev = points[0];
        int count = 1;

        for(int i=1; i<points.length; i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];
            int prevStart = prev[0];
            int prevEnd = prev[1];

            // when no overlapping
            if(currStart > prevEnd){
                count++;
                prev = points[i];
            } else{ //when there is overlap
                prev[0] = Math.max(prevStart, currStart);
                prev[1] = Math.min(prevEnd, currEnd);
            }
        }

        return count;
    }
}
