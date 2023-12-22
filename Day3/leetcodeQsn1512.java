package Day3;

// https://leetcode.com/problems/number-of-good-pairs/

public class leetcodeQsn1512 {
    public int numIdenticalPairs(int[] nums) {
        int pair = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(j>i && nums[i]==nums[j]){
                    pair++;
                }
            }
        }

        return pair;
    }
}
