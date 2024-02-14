package Day57;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class leetcodeQsn121 {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //i'th day's profit
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
