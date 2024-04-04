package Day105;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

public class leetcodeQsn1614 {
    public int maxDepth(String s) {
        int ans = 0;
        int count = 0; //for counting opening bracket

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') count++;
            if(s.charAt(i) == ')') count--;

            ans = Math.max(ans,count);
        }

        return ans;
    }
}
