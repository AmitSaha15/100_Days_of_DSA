package Day24;

// https://leetcode.com/problems/number-of-ways-to-split-a-string/

public class leetcodeQsn1573 {
    public int numWays(String s) {
        long n = s.length();
        long mod = 1_000_000_007;
        long ones = 0;

        for(char ch:s.toCharArray()){
            ones += ch - '0';
        }
        if(ones%3 != 0) return 0;
        if(ones == 0) return (int)((((n-1)*(n-2))/2) % mod);

        long oneThird = ones/3;
        ones = 0;
        long cuts1 = 0;
        long cuts2 = 0;
        for(char ch:s.toCharArray()){
            ones += ch - '0';
            if(ones == oneThird) cuts1++;
            if(ones == 2*oneThird) cuts2++;
        }
        return (int)((cuts1*cuts2) % mod);
    }
}
