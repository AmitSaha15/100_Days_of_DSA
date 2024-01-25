package Day37;

// https://leetcode.com/problems/length-of-last-word/

public class leetcodeQsn58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        if(n == 1) return 1;

        int count = 0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == ' ') break;
            else count++;
        }
        return count;
    }
}
