package Day61;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/palindrome-partitioning/

public class leetcodeQsn131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        if (s.equals("")) {
            ans.add(new ArrayList<>());
            return ans;
        }
        for (int i=0; i<s.length(); i++) {
            if (isPalindrome(s, i+1)) {
                for (List<String> list : partition(s.substring(i + 1))) {
                    list.add(0, s.substring(0, i + 1));
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String str, int n) {
        for (int i=0; i<n/2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        }
        return true;
    }
}
