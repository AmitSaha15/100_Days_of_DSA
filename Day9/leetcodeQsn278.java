package Day9;

// https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 0;
        int last = n;

        while(first <= last){
            int mid = first + (last-first)/2;
            if(isBadVersion(mid)){
                last = mid-1;
            } else{
                first = mid+1;
            }
        }
        return first;
    }
}
