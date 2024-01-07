package Day19;

import java.util.Arrays;

// https://leetcode.com/problems/3sum-closest/

public class leetcodeQsn16 {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n-2; i++){
            int fp = i+1;
            int lp = n-1;
            while(lp>fp){
                int currSum = nums[i]+nums[fp]+nums[lp];
                if(currSum>target){
                    lp--;
                } else{
                    fp++;
                }

                if(Math.abs(target-currSum) < Math.abs(target-ans)){
                    ans = currSum;
                }
            }
        }
        return ans;
    }
}
