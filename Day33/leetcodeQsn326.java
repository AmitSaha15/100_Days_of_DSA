package Day33;

// https://leetcode.com/problems/power-of-three/

public class leetcodeQsn326 {
    public boolean isPowerOfThree(int n) {
        while(n >= 3){
            if(n%3 != 0) return false;
            n /= 3;
        }

        return n==1;

        // RECURSION 
        
        // if(n == 0) return false;
        // if(n == 1) return true;
        // if(n%3 == 0) return isPowerOfThree(n/3);
        // return false;
    }
}
