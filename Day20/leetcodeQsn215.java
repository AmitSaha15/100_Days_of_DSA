package Day20;

import java.util.Arrays;

// https://leetcode.com/problems/kth-largest-element-in-an-array/

public class leetcodeQsn215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-k];
    }
}
