package Day59;

// https://leetcode.com/problems/is-subsequence/

public class leetcodeQsn392 {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        
        int left = 0;
        int right = 0;

        while (left<s.length() && right<t.length()) {
            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            right++;
            if (left == s.length()) {
                return true; 
            }
        }
        
        return false;
    }
}
