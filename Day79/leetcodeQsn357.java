package Day79;

// https://leetcode.com/problems/count-numbers-with-unique-digits/

public class leetcodeQsn357 {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) return 1;

        // int ans = 10; //there are 10 unique single digits (0 included of course)
        int start = 9; //we will have 9 choices to start with for 1st position(1-9, 0 excluded)
        // for 2nd position also 9 choices(0 can be included this time)
        int curr = 9; //to keep track of the choices for current position
        int temp = n;

        while(n-- > 1){
            curr *= start--;
            // ans += curr;
        }
        return curr+countNumbersWithUniqueDigits(temp-1);
    }
}
