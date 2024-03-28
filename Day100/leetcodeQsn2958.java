package Day100;

import java.util.HashMap;

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/

public class leetcodeQsn2958 {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = 0;

        int i=0, j=0;

        while(j<nums.length){
            freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1); //updating the freq of jth elem

            while(freq.get(nums[j]) > k){ //if the freq of jth item is more than k then move i pointer forward and keep decreasing the frequency of the ith item until the jth item frequncy is less than k
                freq.put(nums[i], freq.get(nums[i])-1);
                i++;
            }

            ans = Math.max(ans, j-i+1); //max window size
            j++;
        }
        return ans;
    }
}
