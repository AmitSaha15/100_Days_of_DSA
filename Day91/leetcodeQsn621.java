package Day91;

import java.util.Arrays;

// https://leetcode.com/problems/task-scheduler/

public class leetcodeQsn621 {
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        int[] tasksFreq = new int[26];

        for(char ch : tasks){
            tasksFreq[ch - 'A']++;
        }
        Arrays.sort(tasksFreq);

        int maxFreq = tasksFreq[25] - 1;
        int idleSlots = maxFreq * n;

        for(int i=24; i>=0; i--){
            idleSlots -= Math.min(maxFreq, tasksFreq[i]);
        }

        // if(idleSlots > 0) return idleSlots+len;
        return idleSlots>0 ? idleSlots+len : len;
    }
}
