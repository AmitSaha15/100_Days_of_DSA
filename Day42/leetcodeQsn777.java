package Day42;

// https://leetcode.com/problems/swap-adjacent-in-lr-string/

public class leetcodeQsn777 {
    public boolean canTransform(String start, String end) {
        int i = 0;
        int j = 0;
        char[] startArr = start.toCharArray();
        char[] endArr = end.toCharArray();

        
        while(i < startArr.length || j < endArr.length){
            // stop when the char is not 'X'
            while (i < startArr.length && startArr[i] == 'X') i++;
            while (j < endArr.length && endArr[j] == 'X') j++;

            //both pointer reach the end of the arrays means the strings are transformable
            if(i == startArr.length && j == endArr.length){
                return true;
            }
            //one of the pointer reach the end of the arrays means the strings are not transformable
            if(i == startArr.length || j == endArr.length){
                return false;
            }

            if (startArr[i] != endArr[j]) return false;
            // char 'R' can only be moved to the right, j should be greater or equal to i
            if (startArr[i] == 'R' && i > j) return false;
            // char 'L' can only be moved to the left, i should be greater or equal to j
            if (startArr[i] == 'L' && i < j) return false;
            
            // check next
            i++;
            j++;
        }
        return i==j;
    }
}
