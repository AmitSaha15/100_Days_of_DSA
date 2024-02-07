package Day50;

// https://leetcode.com/problems/minimum-size-subarray-sum/

public class leetcodeQsn209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                ans = Math.min(right - left + 1, ans);
                sum -= nums[left];
                left++;
            }
        }

        return (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}
