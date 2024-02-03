package Day46;

// https://leetcode.com/problems/student-attendance-record-i/

public class leetcodeQsn551 {
    public boolean checkRecord(String s) {
        int absCount = 0;
        int lateCount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                absCount++;
                if(absCount >= 2) return false;
                lateCount = 0; //need to reset 'lateCount' when it's not in consecutive days
            } else if(s.charAt(i) == 'L'){
                lateCount++;
                if(lateCount >= 3) return false;
            } else{
                lateCount = 0; //same reset 'lateCount'
            }
        }
        return true;

        
        // return !s.contains("LLL") && absCount<2;
    }
}
