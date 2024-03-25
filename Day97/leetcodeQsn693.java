package Day97;

// https://leetcode.com/problems/binary-number-with-alternating-bits/

public class leetcodeQsn693 {
    public boolean hasAlternatingBits(int n) {
        int lastBit = n&1;
        n >>= 1;

        while(n>0){
            int currBit = n&1;
            if(lastBit == currBit) return false;

            lastBit = currBit;
            n >>= 1;
        }
        return true;
    }
}
