package Day35;

// https://leetcode.com/problems/count-good-numbers/

public class leetcodeQsn1922 {
    long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long oddIndices = n/2;
        long evenIndices = n - oddIndices;

        return (int)(power(5,evenIndices)*power(4,oddIndices) % mod);
    }

    long power(long x, long n){
        if(n == 0) return 1;
        if(x == 0) return 0;

        long temp = power(x,n/2);
        if(n%2 == 0){
            return (temp*temp) % mod;
        } else{
            return (x*temp*temp) % mod;
        }
    }
}
