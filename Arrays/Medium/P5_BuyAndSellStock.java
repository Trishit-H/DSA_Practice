// Best time to buy and sell stock

// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
// day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. 
// If you cannot achieve any profit, return 0.

package Arrays.Medium;

public class P5_BuyAndSellStock {

    public static int maxProfit(int[] prices) {

        // Minimum price seen so far
        int minPrice = prices[0];

        // Maximum profit found so far
        int maxProfit = 0;

        // Traverse from the second day
        for (int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit by selling today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum profit = " + maxProfit(prices));
    }
}
