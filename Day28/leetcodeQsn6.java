package Day28;

// https://leetcode.com/problems/zigzag-conversion/

public class leetcodeQsn6 {
    public String convert(String s, int numRows) {
        if(numRows <= 1) return s;

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<numRows; i++){
            int index=i;
            int down = 2*(numRows-1-i);
            int up = 2*i;
            boolean isGoingDown = true;
            while(index < s.length()){
                ans.append(s.charAt(index));
                if(i == 0){
                    index += down;
                }else if(i == numRows-1){
                    index += up;
                }
                else{
                    if(isGoingDown){
                        index += down;
                    } else{
                        index += up;
                    }
                    isGoingDown = !isGoingDown;                
                }
            }
        }
        return ans.toString();
    }
}
