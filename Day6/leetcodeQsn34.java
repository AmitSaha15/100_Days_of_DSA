package Day6;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class leetcodeQsn34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1, end = -1;
        if(n==0){
            return new int[]{-1,-1};
        }

        for(int i = 0; i < n ;i++){
            if(nums[i] == target){
                first = i;
                break;
            }
        }
        for(int i = n-1; i >= 0 ;i--){
            if(nums[i] == target){
                end = i;
                break;
            }
        }

        return new int[]{first,end};
    }
}
