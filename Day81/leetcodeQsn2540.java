package Day81;

// https://leetcode.com/problems/minimum-common-value/

public class leetcodeQsn2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        // two pointers approach -->

        int p1 = 0;
        int p2 = 0;

        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1] > nums2[p2]) p2++;
            else if(nums1[p1] < nums2[p2]) p1++;
            else return nums1[p1];
        }
        return -1;

        // binary search approach -->

        // if(nums2.length > nums1.length){
        //     return getCommon(nums2, nums1);
        // }

        // for(int num : nums1){ //take a number from `nums1` array then search(binary) it in `nums2` array
        //     if(BS(nums2, num) == 1){
        //         return num;
        //     }
        // }
        // return -1;
    }
    // public int BS(int[] arr,int target){
    //     int start = 0;
    //     int end = arr.length-1;

    //     while(end>=start){
    //         int mid = start + (end-start) / 2;
    //         if(arr[mid] == target) return 1;
    //         else if(arr[mid] > target){
    //             end = mid-1;
    //         } else{
    //             start = mid+1;
    //         }
    //     }
    //     return -1;
    // }
}
