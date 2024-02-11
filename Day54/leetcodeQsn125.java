package Day54;

// https://leetcode.com/problems/valid-palindrome/

public class leetcodeQsn125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while(right>=left){
            if(!validChar(s.charAt(left))) left++;
            else if(!validChar(s.charAt(right))) right--;
            else{
                if(s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean validChar(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122);
    }
}
