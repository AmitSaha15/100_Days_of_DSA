package Day21;

import java.util.Arrays;

// https://leetcode.com/problems/third-maximum-number/

public class leetcodeQsn414 {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if (n < 3) {
            return nums[n - 1];
        }

        int count = 0;

        for (int i = n-1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }

            if (count == 2) {
                return nums[i - 1];
            }
        }

        return nums[n - 1];
    }
}
