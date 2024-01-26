package Day38;

// https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

public class leetcodeQsn1784 {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)) count++;
        }

        return !(count>1);
    }
}
