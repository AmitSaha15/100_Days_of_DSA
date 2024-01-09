package Day21;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/

public class leetcodeQsn628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int a = nums[0] * nums[1] * nums[n];
        int b = nums[n] * nums[n - 1] * nums[n - 2];
        return Math.max(a, b);
    }
}
