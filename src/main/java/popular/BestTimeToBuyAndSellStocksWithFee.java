package popular;

/**
 * Medium
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.
 * <p>
 * Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.
 * <p>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [1,3,2,8,4,9], fee = 2
 * <p>
 * Output: 8
 * <p>
 * Explanation: The maximum profit can be achieved by:
 * <p>
 * Buying at prices[0] = 1
 * <p>
 * Selling at prices[3] = 8
 * <p>
 * Buying at prices[4] = 4
 * <p>
 * Selling at prices[5] = 9
 * <p>
 * The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
 * <p>
 * Example 2:
 * <p>
 * Input: prices = [1,3,7,5,10,3], fee = 3
 * <p>
 * Output: 6
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 5 * 10^4
 * 1 <= prices[i] < 5 * 10^4
 * 0 <= fee < 5 * 10^4
 */
public class BestTimeToBuyAndSellStocksWithFee {

    public static void main(String[] args) throws Exception {
        int[] A = {1, 3, 2, 8, 4, 9};
        System.out.println(new BestTimeToBuyAndSellStocksWithFee().maxProfit(A, 2));
    }

    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }
}
