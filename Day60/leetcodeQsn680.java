package Day60;

// https://leetcode.com/problems/valid-palindrome-ii/

public class leetcodeQsn680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(j>=i){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String str, int start, int end){
        while(end>=start){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
