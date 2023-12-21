package Day1;

// https://www.codingninjas.com/studio/problems/count-digits_8416387

public class count_digits {
    public static int countDigits(int n){
        // Write your code here.
        int divCount = 0;
        int original = n;
        while (n > 0) {
            int digit = n%10;
            if (digit != 0 && original % digit == 0) {
                divCount += 1;
            }

            n = n/10;
        }

        return divCount;
    }
}
