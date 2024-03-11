package Day83;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/sort-the-students-by-their-kth-score/

public class leetcodeQsn2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        Comparator<int[]> myComp = new Comparator<int[]>(){
            public int compare(int[] s1, int[] s2){
                if(s1[k] >= s2[k]) return -1;
                else return 1;
            }
        };
        Arrays.sort(score, myComp);

        return score;
    }
}
