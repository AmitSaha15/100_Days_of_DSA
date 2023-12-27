package Day8;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class leetcodeQsn744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int start = 0;
        int end = letters.length-1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return letters[start % n];
    }
}
