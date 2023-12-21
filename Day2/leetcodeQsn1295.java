package Day2;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class leetcodeQsn1295 {
    static boolean even(int num){
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1; // Optimization
    }

    public int findNumbers(int[] nums) {
        int finalCount = 0;
        for(int num : nums){
            if(even(num)){
                finalCount++;
            }
        }
        return finalCount;
    }
}
