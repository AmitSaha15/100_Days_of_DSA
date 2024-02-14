package Day57;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class leetcodeQsn122 {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i-1] < prices[i]){ //prev price has to be less to make profit
                totalProfit += prices[i] - prices[i-1];
            }
        }

        return totalProfit;
    }
}
