package Day23;

// https://leetcode.com/problems/split-two-strings-to-make-palindrome/

public class leetcodeQsn1616 {
    public boolean checkPalindromeFormation(String a, String b) {
        return checkFormation(a,b) || checkFormation(b,a);
    }

    boolean checkFormation(String a, String b){
        int l = 0;
        int r = b.length()-1;
        while(r>l && a.charAt(l) == b.charAt(r)){
            l++;
            r--;
        }
        if(l>=r) return true;
        return isPalindrome(a.substring(l,r+1)) || isPalindrome(b.substring(l,r+1));
    }

    boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
