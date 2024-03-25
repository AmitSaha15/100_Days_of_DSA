package Day97;

// https://leetcode.com/problems/number-complement/

public class leetcodeQsn476 {
    public int findComplement(int num) {
        long mask = 1;
        
        while(mask <= num){
            num ^= mask;
            mask *= 2;
        }
        return num;
    }
}
