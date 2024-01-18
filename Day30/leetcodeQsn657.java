package Day30;

// https://leetcode.com/problems/robot-return-to-origin/

public class leetcodeQsn657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] arr = moves.toCharArray();

        for(char ch : arr){
            if(ch == 'U') y++;
            else if(ch == 'D') y--;
            else if(ch == 'R') x++;
            else if(ch == 'L') x--;
        }

        return (x == 0) && (y == 0);
    }
}
