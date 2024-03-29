package Day101;

// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

public class leetcodeQsn2962 {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;

        int maxElem = Integer.MIN_VALUE;
        for(int num=0; num<n; num++){
            maxElem = Math.max(maxElem, nums[num]);
        }

        long ans = 0;
        int count = 0;

        while(j<n){
            if(nums[j] == maxElem){
                count++;
            }

            while(count == k){
                
                if(nums[i] == maxElem){
                    count--;
                }
                i++;
            }
            ans += i;
            j++;
        }
        return ans;
    }
}
