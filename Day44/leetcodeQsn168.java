package Day44;

// https://leetcode.com/problems/excel-sheet-column-title/

public class leetcodeQsn168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while(columnNumber-- > 0){
            char ch = (char) ((columnNumber % 26) + 'A'); //Get current character
            ans.append(ch); // append it into the end
            columnNumber /= 26;
        }

        // reverse the because above we are appending the char at the end
        return ans.reverse().toString();
    }
}
