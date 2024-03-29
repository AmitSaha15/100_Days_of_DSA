package Day94;

// https://leetcode.com/problems/sum-of-two-integers/

public class leetcodeQsn371 {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = (a ^ b);
            b = carry << 1;
        }
        return a;
    }
}
