package Day34;

// https://leetcode.com/problems/powx-n/

public class leetcodeQsn50 {
    public double myPow(double x, int n) {
        // base condition
        if(n == 0) return 1;
        if(x == 0) return 0;

        if(n<0){ // neg values of n needs to be positive
            if(n%2 == 0){
                // dividing n by 2 'cause if we do n=-n and n=Integer.MIN_VALUE then it'll become a value which is greater than the max value of Integer.MAX_VALUE
                n = n/2;
                n = -n;
                x = (1/x) * (1/x);
            } else{ //Odds don't need to be divided as their negative is in the positive limit
                n = -n;
                x = 1/x;
            }
        }

        if(n%2 == 0){
            return myPow(x*x, n/2);
        } else{
            // if n is odd --> eg. n=5, 2^5 = 2*2^2*2^2
            return (x*myPow(x*x, n/2));
        }
    }
}
