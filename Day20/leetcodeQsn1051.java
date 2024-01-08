package Day20;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/

public class leetcodeQsn1051 {
    public int heightChecker(int[] heights) {
        int[] ans = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            ans[i] = heights[i];
        }
        Arrays.sort(ans);
        int count=0;
        for(int i=0; i<heights.length; i++){
            if(ans[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
