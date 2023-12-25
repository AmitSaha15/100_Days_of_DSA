package Day6;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class leetcodeQsn26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int num : nums){
            if (i < 1 || num > nums[i - 1]){
                nums[i++] = num;
            }
        }

        return i;
        
    }
}
