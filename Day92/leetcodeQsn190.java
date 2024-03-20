package Day92;

// https://leetcode.com/problems/reverse-bits/

public class leetcodeQsn190 {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i=0; i<32; i++) {
            int bit = (n >> i) & 1; //to get the ith bit
            ans |= (bit << (31-i)); //to put the bit in reverse order
        }
        return ans;
    }
}
