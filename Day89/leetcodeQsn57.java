package Day89;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/insert-interval/

public class leetcodeQsn57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]){
                ans.add(interval);
            } 
            else if (interval[0] > newInterval[1]) {
                ans.add(newInterval);
                ans.add(interval);
                newInterval = null;
            } else { //merging overlapping intervals
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
