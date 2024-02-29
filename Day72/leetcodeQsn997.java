package Day72;

// https://leetcode.com/problems/find-the-town-judge/

public class leetcodeQsn997 {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1]; //trust count for each person i.e. each 
        // element represents the number of people who trust that person

        for (int[] t : trust) {
            trustCount[t[0]]--; //decrement count by 1 when the person trusts someone else
            trustCount[t[1]]++; //increment count by 1 when the person is trusted by someone else
        }

        for (int i=1; i<=n; i++) {
            // trust count for the town judge will be (n-1) as others except the town 
            // judge trust himself 
            if (trustCount[i] == n-1) {
                return i;
            }
        }

        return -1; // when no judge found
    }
}
