package Day62;

// https://leetcode.com/problems/integer-to-roman/

public class leetcodeQsn12 {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();
        int i=0;
        while(num > 0){
            if(num >= values[i]){
                ans.append(symbols[i]);
                num -= values[i];
            } else{
                i++;
            }
        }
        return ans.toString();
    }
}
