package Day98;

// https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/

public class leetcodeQsn1835 {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = 0;
        int xor2 = 0;

        for(int num1 : arr1){
            xor1 ^= num1;
        }

        for(int num2 : arr2){
            xor2 ^= num2;
        }

        return (xor1 & xor2);
    }
}
