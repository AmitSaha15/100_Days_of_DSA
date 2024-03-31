package Day103;

// https://leetcode.com/problems/count-subarrays-with-fixed-bounds/

public class leetcodeQsn2444 {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        
        int minPos = -1;
        int maxPos = -1;
        int leftBound = -1;
        
        for(int i=0; i<nums.length; i++) {
            
            if(nums[i] < minK || nums[i] > maxK){
                leftBound = i;
            }
            
            if(nums[i] == minK) minPos = i;
            if(nums[i] == maxK) maxPos = i;
            
            int count = Math.min(maxPos, minPos) - leftBound;
            
            ans += (count <= 0) ? 0 : count;
            
        }
        
        return ans;
    }
}
