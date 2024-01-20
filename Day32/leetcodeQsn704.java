package Day32;

// https://leetcode.com/problems/binary-search/

public class leetcodeQsn704 {
    // using recursion
    int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) return -1;

        int mid = start+(end-start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binarySearch(nums,target,0,n-1);

    //     int n = nums.length;
    //     int start = 0;
    //     int end = n-1;
    //     while(end >= start){
    //         int mid = start + (end-start) / 2;
    //         if(nums[mid] == target){
    //             return mid;
    //         }
    //         if(nums[mid] > target){
    //             end = mid-1;
    //         } else{
    //             start = mid+1;
    //         }
    //     }

    //     return -1;
    }
}
