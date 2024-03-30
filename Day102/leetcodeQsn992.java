package Day102;

import java.util.HashMap;

// https://leetcode.com/problems/subarrays-with-k-different-integers/

public class leetcodeQsn992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k - 1);
    }

    public int slidingWindow(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int n = nums.length;
        int i = 0; 
        int j = 0;
        
        int count = 0;
        
        while(j<n) {
            
            freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
            
            while(freq.size() > k) {
                freq.put(nums[i], freq.get(nums[i])-1);
                if(freq.get(nums[i]) == 0) {
                    freq.remove(nums[i]);
                }
                i++;
            }
            
            count += (j-i+1);
            j++;
        }
        
        return count;
    }
}
