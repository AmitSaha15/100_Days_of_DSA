package Day93;

// https://leetcode.com/problems/single-number-iii/

public class leetcodeQsn260 {
    public int[] singleNumber(int[] nums) {
        int unique = 0;

        for(int num : nums){
            unique ^= num;
        }

        int mask = unique & ~(unique-1);
        int[] ans = new int[2];

        for(int num : nums){
            if((num & mask) != 0){
                ans[0] ^= num;
            } else{
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
