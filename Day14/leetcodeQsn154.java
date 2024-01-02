package Day14;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class leetcodeQsn154 {
    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
    
        while (first < last) {
            int mid = (first + last) / 2;
            if(nums[first] == nums[mid] && nums[mid] == nums[last]){
                first++;
                last--;
                continue;
            }
            if (nums[mid] <= nums[last]){
                last = mid;
            }
            else{
                first = mid + 1;
            }
        }
    
        return nums[first];
      }
}
