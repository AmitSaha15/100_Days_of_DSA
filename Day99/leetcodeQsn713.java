package Day99;

// https://leetcode.com/problems/subarray-product-less-than-k/

public class leetcodeQsn713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int i = 0, j = 0;
        int prod = 1;

        if(k<=1) return 0;

        while(j<n){
            prod *= nums[j];

            while(prod >= k){
                prod /= nums[i];
                i++;
            }

            count += (j-i)+1;
            j++;
        }

        return count;
    }
}
