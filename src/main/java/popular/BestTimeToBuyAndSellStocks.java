package popular;

/**
 * Easy
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * <p>
 * Output: 5
 * <p>
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * <p>
 * Output: 0
 * <p>
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 10^5
 * 0 <= prices[i] <= 10^4
 */
public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) throws Exception {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new BestTimeToBuyAndSellStocks().maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0; // Check for empty array or single element

        int minPrice = prices[0]; // Initialize minPrice to the first price
        int maxProfit = 0; // Initialize maxProfit to 0

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // Update minPrice
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Update maxProfit
        }

        return maxProfit; // Return the maximum profit
    }
}
