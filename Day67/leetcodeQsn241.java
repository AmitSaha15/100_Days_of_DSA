package Day67;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/different-ways-to-add-parentheses/

public class leetcodeQsn241 {
    public List<Integer> diffWaysToCompute(String expression) {
        int n = expression.length();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                // whenever we get a operator we will break our problem in sub problems
                List<Integer> leftSubProb = diffWaysToCompute(expression.substring(0,i));
                List<Integer> rightSubProb = diffWaysToCompute(expression.substring(i+1));

                for(int j : leftSubProb){
                    for(int k : rightSubProb){
                        if(ch == '+'){
                            ans.add(j+k);
                        } else if(ch == '-'){
                            ans.add(j-k);
                        } else if(ch == '*'){
                            ans.add(j*k);
                        }
                    }
                }
            }
        }

        // if there is no operator present we should return given `expression` string
        if(ans.size() == 0){
            ans.add(Integer.valueOf(expression));
        }
        return ans;
    }
}
