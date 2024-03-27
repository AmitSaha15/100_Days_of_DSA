package Day99;

import java.util.Arrays;

// https://leetcode.com/problems/regular-expression-matching/

public class leetcodeQsn10 {
    int[][] t;
    public boolean isMatch(String s, String p) {
        t = new int[21][21];

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(0, 0, s, p);

        // recursion code ---->
        // if (p.isEmpty()) {
        //     return s.isEmpty();
        // }

        // boolean firstMatch = false;
        // if (s.length() > 0 && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
        //     firstMatch = true;
        // }

        // if (p.length() >= 2 && p.charAt(1) == '*') {
        //     return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        // } else {
        //     return firstMatch && isMatch(s.substring(1), p.substring(1));
        // }
    }

    public boolean solve(int i, int j, String s, String p) {
        if (j == p.length()) {
            return i == s.length();
        }

        if (t[i][j] != -1) {
            return t[i][j] == 1;
        }

        boolean ans = false;

        boolean firstMatch = (i<s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = (solve(i, j+2, s, p) || (firstMatch && solve(i+1, j, s, p)));
        } else {
            ans = firstMatch && solve(i+1, j+1, s, p);
        }

        return (t[i][j] = ans ? 1 : 0) == 1;
    }
}
