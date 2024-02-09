package Day52;

// https://leetcode.com/problems/gas-station/

public class leetcodeQsn134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int index = 0;

        for(int i=0; i<gas.length; i++){ //calculate the total of gas and cost
            gasSum += gas[i];
            costSum += cost[i];
        }

        //if the costSum is greater than gasSum, it's not possible to complete the circuit
        if(costSum > gasSum) return -1;

        int gasRemaining = 0;
        for(int i=0; i<gas.length; i++){
            gasRemaining += gas[i]-cost[i];
            //if gasRemaining becomes negative, set index to the next station and 
            // reset gasRemaining to 0 (as we are being greedy)
            if(gasRemaining < 0){
                index = i+1;
                gasRemaining = 0;
            }
        }
        return index;
    }
}
