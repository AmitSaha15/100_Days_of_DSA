package Day58;

import java.util.Arrays;

// leetcode.com/problems/find-polygon-with-the-largest-perimeter/

public class leetcodeQsn2971 {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long prevSum = 0;
        long ans = -1;

        for(int num : nums){
            if(prevSum > num){
                ans = (prevSum + num);
            }

            prevSum += num;
        }
        return ans;
    }
}
