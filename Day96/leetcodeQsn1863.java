package Day96;

// https://leetcode.com/problems/sum-of-all-subset-xor-totals/

public class leetcodeQsn1863 {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int i, int currXOR) {
        // base condition
        if (i == nums.length) return currXOR; //return currXOR when all elements in nums are already considered
        
        // sum of xor considering curr elem
        int withElement = helper(nums, i+1, currXOR ^ nums[i]);
        
        // sum of xor without curr elem
        int withoutElement = helper(nums, i+1, currXOR);
        
        return withElement + withoutElement; //return the sum
    }
}
