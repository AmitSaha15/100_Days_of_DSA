package Day9;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class leetcodeQsn33 {
    int find_pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }

    int binary_search(int[] arr, int target, int start, int end){
        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = find_pivot(nums);

        if(pivot == -1){
            return binary_search(nums,target,0,n-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binary_search(nums,target,0,pivot-1);
        }
        
        return binary_search(nums,target,pivot+1,n-1);
    }
}
