/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 */
package leetcode_easy;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int min = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}
