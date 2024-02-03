package Day46;

// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

public class leetcodeQsn1750 {
    public int minimumLength(String s) {
        int i = 0;
        int  j = s.length()-1;

        while(j > i){
            if(s.charAt(i) != s.charAt(j)) break;
            char ch = s.charAt(i);

            while(i<j && ch == s.charAt(i)) i++;
            while(i<=j && ch == s.charAt(j)) j--;
        }
        return j-i+1;
    }
}
