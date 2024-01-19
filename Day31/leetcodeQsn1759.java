package Day31;

// https://leetcode.com/problems/count-number-of-homogenous-substrings/

public class leetcodeQsn1759 {
    public int countHomogenous(String s) {
        int n = s.length();
        int l = 0;
        long count = 0;

        for(int r=0; r<n; r++){
            if(s.charAt(l) == s.charAt(r)){
                count += r-l+1;
            } else{
                count++;
                l = r;
            }
        }

        return (int)(count % 1_000_000_007);
    }
}
