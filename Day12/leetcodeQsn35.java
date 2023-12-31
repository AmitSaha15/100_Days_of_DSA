package Day12;

// https://leetcode.com/problems/search-insert-position/

public class leetcodeQsn35 {
    public int searchInsert(int[] nums, int target) {
        int s=0;
        int e=nums.length;
        while(e > s){
            int mid = (s+e)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                s = mid+1;
            } else{
                e=mid;
            }
        }

        return s;
    }
}
