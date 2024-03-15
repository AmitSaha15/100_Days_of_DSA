package Day87;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/

public class leetcodeQsn1498 {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1_000_000_007;
        int n = nums.length;
        Arrays.sort(nums);

        int powersOfTwo[] = new int[n];
        powersOfTwo[0] = 1;

        for(int i=1; i<n; i++){
            powersOfTwo[i] = (powersOfTwo[i-1]*2) % MOD;
        }

        int ans = 0;
        int left = 0;
        int right = n-1;
        while(right >= left){
            if(nums[left] + nums[right] <= target){ //when the sum is not greater than target increment the left pointer
                ans = (ans%MOD + powersOfTwo[right-left]) % MOD;
                left++;
            }
            else right--;
        }
        return ans;
    }
}
