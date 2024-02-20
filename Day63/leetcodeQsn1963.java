package Day63;

// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/

public class leetcodeQsn1963 {
    public int minSwaps(String s) {
        int extraClosingBrackets = 0; // count extra closing brackets when ']' found 
        // increment it by 1 when '[' found decrement by 1

        int maxCount = 0; // keep track of max closing bracket at any point while traversing the string

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ']') { 
                extraClosingBrackets++;
                maxCount = Math.max(extraClosingBrackets, maxCount);
            } else{
                extraClosingBrackets--;
            }
        }
        // why not return maxCount? --> 'cause 1 swap cancels out 2 extra closing brackets
        // ']]][[[[]' after swapping 1st and 7th --> '[]][[[]]' we can see first two cancels
        // each other i.e. after 1 swap 2 extra closing brackets gone

        return (maxCount + 1) / 2;
    }
}
