package Day11;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class leetcodeQsn167 {
    public int[] twoSum(int[] numbers, int target) {
        // int[] ans = {0,0};
        int l=0;
        int r=numbers.length-1;

        while(numbers[l] + numbers[r] != target){
            if(numbers[l] + numbers[r] > target){
                r--;
            } else{
                l++;
            }
        }

        // ans[0] = l+1;
        // ans[1] = r+1;
        return new int[]{l+1, r+1};
    }
}
