package Day89;

// https://leetcode.com/problems/single-number/

public class leetcodeQsn136 {
    public int singleNumber(int[] nums) {
        int unique = 0;

        for(int num : nums){
            unique ^= num;
        }

        return unique;
    }
}
