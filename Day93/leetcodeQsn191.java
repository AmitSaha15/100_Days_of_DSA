package Day93;

// https://leetcode.com/problems/number-of-1-bits/

public class leetcodeQsn191 {
    public int hammingWeight(int n) {
        int count = 0;

        for (int i = 31; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                count++;
            }
        }

        return count;
    }
}
