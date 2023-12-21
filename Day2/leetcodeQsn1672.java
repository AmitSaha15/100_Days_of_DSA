package Day2;

// https://leetcode.com/problems/richest-customer-wealth/

public class leetcodeQsn1672 {
    public int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for(int customer = 0; customer < accounts.length; customer++){
            int sum = 0;
            for(int acc = 0; acc < accounts[customer].length; acc++){
                sum = sum + accounts[customer][acc];
            }

            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
