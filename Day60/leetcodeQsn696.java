package Day60;

// https://leetcode.com/problems/count-binary-substrings/

public class leetcodeQsn696 {
    public int countBinarySubstrings(String s) {
        int count = 0, prev = 0, curr = 1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                count += Math.min(prev,curr);
                prev = curr;
                curr = 1;
            } else{
                curr++;
            }
        }

        return count+=Math.min(prev,curr);
    }
}
