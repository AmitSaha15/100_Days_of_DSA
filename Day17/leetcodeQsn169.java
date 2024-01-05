package Day17;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/

public class leetcodeQsn169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
