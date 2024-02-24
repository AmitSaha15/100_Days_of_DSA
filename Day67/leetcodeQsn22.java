package Day67;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/

public class leetcodeQsn22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, n, "", 0, 0);
        return ans;
    }

    public void backtrack(List<String> ans, int n, String s, int openPar, int closePar){
        if(s.length() == n*2){ // n pairs of parentheses needs to be added
            ans.add(s);
            return;
        }

        if(openPar < n){
            backtrack(ans, n, s + "(", openPar + 1, closePar);
        }
        if(closePar < openPar){
            backtrack(ans, n, s + ")", openPar, closePar + 1);
        }
    }
}
