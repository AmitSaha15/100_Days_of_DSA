package Day23;

// https://leetcode.com/problems/string-to-integer-atoi/

public class leetcodeQsn8 {
    public int myAtoi(String s) {
        int ans = 0;
        int i=0;
        int sign = 1;

        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        
        if(s.charAt(i) == '+'){
            sign = 1;
            i++;
        }else if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(ans>Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10)){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans*10 + digit;
            i++;
        }
        return sign*ans;
    }
}
