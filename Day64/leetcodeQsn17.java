package Day64;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class leetcodeQsn17 {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return combinations("", digits);
    }
    public List<String> combinations(String str, String input) {
        if (input.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(str);
            return ans;
        }
        int digit = input.charAt(0) - '0'; // this will convert '2' into 2
        int i = (digit-2) * 3;
        if(digit>7){
            i += 1;
        }

        int len = i+3;
        if(digit == 7 || digit == 9){ //7 and 9 has 4 chars, so the value of i in the for loop changes
            len += 1;
        }

        List<String> ans = new ArrayList<>();

        while(i<len) {
            char ch = (char) ('a' + i);
            ans.addAll(combinations(str + ch, input.substring(1)));
            i++;
        }
        return ans;
    }
}
