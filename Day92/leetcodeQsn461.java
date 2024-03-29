package Day92;

// https://leetcode.com/problems/hamming-distance/

public class leetcodeQsn461 {
    public int hammingDistance(int x, int y) {
        int ans = x^y;
        int count = 0;

        while(ans>0){
            count += ans & 1;
            ans >>= 1;
        }
        return count;
    }
}
