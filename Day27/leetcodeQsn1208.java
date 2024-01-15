package Day27;

// https://leetcode.com/problems/get-equal-substrings-within-budget/

public class leetcodeQsn1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int ans = 0, left = 0, right = 0, cost = 0;

        while(right < n){
            cost += Math.abs((s.charAt(right) - t.charAt(right)));
            while(cost > maxCost){
                cost -= Math.abs((s.charAt(left) - t.charAt(left)));
                left++;
            }
            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}
