package Day95;

// https://leetcode.com/problems/divide-two-integers/

public class leetcodeQsn29 {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == divisor) return 1;

        boolean sign = true; //sign --> +ve
        if(dividend>=0 && divisor<0) sign = false;
        else if(dividend<0 && divisor>=0) sign = false;

        long num = Math.abs((long)dividend);
        long div = Math.abs((long)divisor);
        int ans = 0;

        while(num >= div){
            int pow = 0;
            while(num >= (div << pow)){
                pow++;
            }
            pow--;
            ans += (1 << pow);
            num -= (div << pow);
        }

        return sign ? ans : -ans;
    }
}
