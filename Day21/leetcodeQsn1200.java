package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-absolute-difference/

public class leetcodeQsn1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){
            int currDiff = arr[i+1] - arr[i];
            if (currDiff <= minDiff) {
                if (currDiff < minDiff) {
                    minDiff = currDiff;
                    ans.clear();
                }
            ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}
