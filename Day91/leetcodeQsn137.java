package Day91;

// https://leetcode.com/problems/single-number-ii/

public class leetcodeQsn137 {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ones = 0, twos = 0;
        for(int i=0; i<n; i++){
            ones = ((ones^nums[i]) & ~twos);
            twos = ((twos^nums[i]) & ~ones);
        }
        return ones;


        // int n = nums.length;
        // Arrays.sort(nums);

        // int i = 1;
        // while(i<n){
        //     if(nums[i] != nums[i-1]) return nums[i-1];
        //     i += 3;
        // }
        // return nums[n-1];
    }
}
