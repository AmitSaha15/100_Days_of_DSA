package Day86;

// https://leetcode.com/problems/binary-subarrays-with-sum/

public class leetcodeQsn930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int currSum = 0;
        int prefixSum[] = new int[nums.length+1];
        prefixSum[0] = 1;
        
        for (int num : nums) {
            currSum += num;
            if (currSum >= goal) {
                count += prefixSum[currSum - goal];
            }
            prefixSum[currSum]++;
        }
        
        return count;
    }
}
