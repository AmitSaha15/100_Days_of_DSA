package Day6;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class leetcodeQsn34 {

    // BRUTE FORCE APPROACH ---> O(n) time complexity

    // public int[] searchRange(int[] nums, int target) {
    //     int n = nums.length;
    //     int first = -1, end = -1;
    //     if(n==0){
    //         return new int[]{-1,-1};
    //     }

    //     for(int i = 0; i < n ;i++){
    //         if(nums[i] == target){
    //             first = i;
    //             break;
    //         }
    //     }
    //     for(int i = n-1; i >= 0 ;i--){
    //         if(nums[i] == target){
    //             end = i;
    //             break;
    //         }
    //     }

    //     return new int[]{first,end};
    // }


    // BINARY SEARCH APPROACH ---> O(logn) time complexity

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int startIndex = search(nums,target,true);
        int endIndex = search(nums,target,false);

        ans[0] = startIndex;
        ans[1] = endIndex;

        return ans;
    }

    int search(int[] arr, int target, boolean findStartIndex){
        int index = -1;
        int start = 0;
        int end = arr.length-1;

        while (end >= start) {
           int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                index = mid;
                if(findStartIndex){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }

        return index;
    }

}
