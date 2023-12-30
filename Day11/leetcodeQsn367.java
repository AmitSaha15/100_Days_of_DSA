package Day11;

// https://leetcode.com/problems/valid-perfect-square/

public class leetcodeQsn367 {
    public boolean isPerfectSquare(int num) {
        if (num<2){
            return true;
        }
        
        long start = 2;
        long end = num ;

        while (start <= end) {
            long mid = (start + end) / 2;
            long val = mid*mid;
            if(val == num){
                return true;
            }
            if (val >= num){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }

        return false;
    }
}
