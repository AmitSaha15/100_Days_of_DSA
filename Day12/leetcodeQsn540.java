package Day12;

// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class leetcodeQsn540 {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(end>start){
            int mid = start + (end-start)/2;
            if(mid % 2 != 0){
                mid--;
            }
            if(nums[mid] != nums[mid+1]){
                end = mid;
            } else{
                start = mid+2;
            }
        }

        return nums[start];
    }
}
