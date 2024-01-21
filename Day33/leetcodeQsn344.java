package Day33;

// https://leetcode.com/problems/reverse-string/

public class leetcodeQsn344 {
    public void reverseString(char[] s) {
        // int start = 0;
        // int end = n-1;
        
        // while(end>start){
        //     char temp = s[start];
        //     s[start] = s[end];
        //     s[end] = temp;
        //     start++;
        //     end--;
        // }

        // RECURSION
        int n = s.length;
        reverse(s,0,n-1);
    }

    char[] reverse(char[] s, int start, int end){
        if(start>end) return s;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        reverse(s, start+1, end-1);
        return s;
    }
}
