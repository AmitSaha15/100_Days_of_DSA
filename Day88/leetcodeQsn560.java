package Day88;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/subarray-sum-equals-k/

public class leetcodeQsn560 {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1); //'cause we are taking the sum as '0' to begin with

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(mp.containsKey(sum-k)){
                count += mp.get(sum-k);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1); //inc. the count of current cumulative sum in map
        }
        // for(int start=0; start<=n-1; start++){
        //     for(int end=start; end<=n-1; end++){
        //         int sum = 0;
        //         for(int i=start; i<=end; i++){
        //             sum += nums[i];
        //         }
        //         if(sum == k) count++;
        //     }
        // }
        return count;
    }
}
