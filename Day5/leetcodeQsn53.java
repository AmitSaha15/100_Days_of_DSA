package Day5;

// https://leetcode.com/problems/maximum-subarray/

public class leetcodeQsn53 {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];


        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxSum;
    }
}
