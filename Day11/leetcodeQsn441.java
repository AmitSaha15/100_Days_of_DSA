package Day11;

// https://leetcode.com/problems/arranging-coins/

public class leetcodeQsn441 {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n ;

        while (start <= end) {
            long mid = (start + end) / 2;
            if (n >= (mid * (mid + 1 ) /2)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return (int)start-1;
    }
}
