package Day87;

import java.util.Arrays;

// https://leetcode.com/problems/valid-triangle-number/

public class leetcodeQsn611 {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;

        Arrays.sort(nums);
        for(int i=n-1; i>=2; i--){
            int l = 0;
            int r = i-1;
            while(r > l){
                if(nums[l]+nums[r] > nums[i]){
                    ans += (r-l);
                    r--;
                } else{
                    l++;
                }
            }
        }
        return ans;
    }
}
