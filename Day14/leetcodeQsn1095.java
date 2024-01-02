package Day14;

// https://leetcode.com/problems/find-in-mountain-array/

public class leetcodeQsn1095 {
    
}

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int order_agnosticBS(MountainArray mountainArr, int target, int start, int end){
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (mountainArr.get(mid) < target) {
                start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            } else{
                if (mountainArr.get(mid) > target) {
                start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }

    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end){
            int mid = start + (end-start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                end = mid;
            } else{
                start = mid + 1;
            }
        }

        return start;
    }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstSearch = order_agnosticBS(mountainArr, target, 0, peak);
        if(firstSearch != -1){
            return firstSearch;
        }

        return order_agnosticBS(mountainArr, target, peak+1, mountainArr.length()-1);
    }
}
