package Day98;

// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/public

public class leetcodeQsn2220 {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal; //by xoring start and goal in the output number we are getting
        // only bits are set which are different in both
        int count = 0;
        
        while (xor>0) { //counting the set bits (Kernighan’s algorithm)
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
