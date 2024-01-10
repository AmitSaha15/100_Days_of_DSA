package Day22;

import java.util.Arrays;

// https://leetcode.com/problems/find-right-interval/

public class leetcodeQsn436 {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0] = intervals[i][0];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a,b) -> (a[0] - b[0]));

        int ans[] = new int[n];
        
        for(int i=0;i<n;i++) {
            int target = intervals[i][1];
            int s = 0, e = n-1;
            while(e>=s) {
                int mid = s+(e-s)/2;
                if(arr[mid][0] >= target) e = mid - 1;
                else if(arr[mid][0] < target) s = mid + 1;   
            }
            if(s<n) ans[i] = arr[s][1];
            else ans[i] = -1;
        }
        return ans;
    }
}
