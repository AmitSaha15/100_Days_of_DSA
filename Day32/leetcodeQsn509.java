package Day32;

// https://leetcode.com/problems/fibonacci-number/

public class leetcodeQsn509 {
    public int fib(int n) {
        // if(n == 0) return 0;
        // int prev = 0;
        // int curr = 1;
        // for(int i=1; i<n; i++){
        //     int temp = prev+curr;
        //     prev = curr;
        //     curr = temp;
        // }
        // return curr;

        // using recursion
        if(n<2) return n;

        return fib(n-1)+fib(n-2);
    }
}
