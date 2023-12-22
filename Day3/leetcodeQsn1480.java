package Day3;

// https://leetcode.com/problems/running-sum-of-1d-array/

public class leetcodeQsn1480 {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            sum[i] = nums[i] + sum[i-1];
        }

        return sum;
    }
}
