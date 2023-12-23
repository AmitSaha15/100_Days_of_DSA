package Day4;

// https://leetcode.com/problems/find-the-highest-altitude/

public class leetcodeQsn1732 {
    public int largestAltitude(int[] gain) {
        int currSum = 0;
        int maxAlt = 0;

        for(int i=0; i<gain.length; i++){
            currSum = currSum + gain[i];

            maxAlt = Math.max(currSum, maxAlt);
        }

        return maxAlt;
    }
}
