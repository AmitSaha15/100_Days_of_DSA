package Day24;

// https://leetcode.com/problems/valid-number/

public class leetcodeQsn65 {
    public boolean isNumber(String s) {
        boolean isDigit = false;
        boolean isDot = false;
        boolean isE = false;
        int countSign = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // check for digit
            if(Character.isDigit(ch)) isDigit = true;

            // check for dot
            else if(ch == '.'){
                if(isE || isDot) return false;
                if(i == s.length()-1 && !isDigit) return false;
                isDot = true;
            }

            // check for e/E
            else if(ch == 'e' || ch == 'E'){
                if(isE || !isDigit || i == s.length()-1) return false;
                isE = true;
            }

            // check for sign
            else if(ch == '+' || ch == '-'){
                if(countSign == 2) return false;
                if(i != 0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')) return false;
                if(i == s.length()-1) return false;
                countSign++;
            } else{
                return false;
            }
        }
        return true;
    }
}
