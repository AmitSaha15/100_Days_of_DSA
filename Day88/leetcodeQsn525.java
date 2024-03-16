package Day88;

import java.util.Arrays;

// https://leetcode.com/problems/contiguous-array/

public class leetcodeQsn525 {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        
        int[] arr = new int[2*n + 1];
        Arrays.fill(arr, -2);
        arr[n] = -1;

        int currSum = 0;
        int maxLen = 0;
        for (int i=0; i<n; i++) {
            currSum += (nums[i] == 0) ? -1 : 1; //we are replacing '0' with '-1' then adding it in currSum, that way when there are same number of zeros and ones present the sum will be 0
            if (arr[currSum + n] >= -1) {
                maxLen = Math.max(maxLen, i - arr[currSum + n]);
            } else{
                arr[currSum + n] = i;
            }
        }
        return maxLen;
    }
}
