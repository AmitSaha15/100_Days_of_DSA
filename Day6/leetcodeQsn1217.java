package Day6;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class leetcodeQsn1217 {
    public int minCostToMoveChips(int[] position) {
        int chipStack = 0;
        for(int i=0; i<position.length; i++){
            if(position[i] % 2 == 0){
                chipStack++;
            }
        }
        return Math.min(chipStack, (position.length - chipStack));

    }
}
