package Day38;

// https://leetcode.com/problems/check-if-it-is-a-good-array/

public class leetcodeQsn1250 {
    // Bezout's Identity
    // For nonzero integers a and b, let d be the greatest common divisor d = gcd(a,b). Then, there exist integers x and y such that ax+by=d.
    public boolean isGoodArray(int[] nums) {
        int n = nums.length;
        int ans = nums[0];

        for(int i=1; i<n; i++){ //check for GCD and return true if its 1
            ans = calculateGCD(ans, nums[i]);
            if(ans == 1) return true;
        }

        return ans == 1;
    }

    int calculateGCD(int a, int b){
        if(b == 0) return a;

        return calculateGCD(b, a%b);
    }
}
