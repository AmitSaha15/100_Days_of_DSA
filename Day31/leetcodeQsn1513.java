package Day31;

// https://leetcode.com/problems/number-of-substrings-with-only-1s/

public class leetcodeQsn1513 {
    public int numSub(String s) {
        int n = s.length();
        long count = 0;
        long ans = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1') count++;
            else{
                ans += count*(count+1)/2;
                count = 0;
            }
        }
        ans += count*(count+1)/2;
        return (int) (ans % 1_000_000_007);
    }
}
