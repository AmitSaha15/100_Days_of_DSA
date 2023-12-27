package Day8;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class leetcodeQsn852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }

        return start; // we can return the end index also cuz at the end of the above condition checks start
                      // == end will point to the maximum element
    }
}
