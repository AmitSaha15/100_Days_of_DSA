package Day12;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class leetcodeQsn153 {
    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
    
        while (first < last) {
          if(nums[first] <= nums[last]){
            return nums[first];
          }
          
          int mid = (first + last) / 2;
          if (nums[mid] < nums[last]){
            last = mid;
          }
          else{
            first = mid + 1;
          }
        }
    
        return nums[first];
    }
}
