package Day60;

// https://leetcode.com/problems/di-string-match/

public class leetcodeQsn942 {
    public int[] diStringMatch(String s) {
        int len = s.length();
        int[] res = new int[len+1];

        int min = 0;
        int max = len;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == 'I'){
                res[i] = min;
                min++;
            } else{
                res[i] = max;
                max--;
            }
        }
        res[len] = max;
        return res;
    }
}
