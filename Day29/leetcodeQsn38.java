package Day29;

// https://leetcode.com/problems/count-and-say/

public class leetcodeQsn38 {
    public String countAndSay(int n) {

        String[] result = new String[n];
        result[0] = "1";
        for(int i=1; i<n; i++){
            result[i] = helper(result[i-1].toCharArray());
        }
        return result[n-1];
    }

    private String helper(char[] s) {

        StringBuilder sb = new StringBuilder();
        char currChar = s[0];
        int count = 1;

        for (int i = 1; i < s.length; i++) {

            if (s[i] != currChar) {
                sb = sb.append(count).append(currChar);
                currChar = s[i];
                count = 1;
            } else {
                count++;
            }
        }

        sb.append(count);
        sb.append(currChar);
        return sb.toString();
    }
}
