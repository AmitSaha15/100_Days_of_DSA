package Day20;

import java.util.Arrays;

// https://leetcode.com/problems/largest-perimeter-triangle/

public class leetcodeQsn976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=n-1; i>=2; i--){
            int a = nums[i-2];
            int b = nums[i-1];
            int c = nums[i];

            if((a+b) > c){
                return a+b+c;
            }
        }
        return 0;
    }
}
