package Day11;

// https://leetcode.com/problems/sqrtx/

public class leetcodeQsn69 {
    public int mySqrt(long x) {
        if (x == 0 || x == 1){
            return (int)x;
        }
        
        long start = 1;
        long end = x ;

        while (start < end) {
        long mid = (start + end) / 2;
        if (mid > x / mid)
            end = mid;
        else
            start = mid + 1;
        }

        return (int)end-1;
    }
}
