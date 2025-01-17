package dynamicprogramming;

/**
 * Medium
 * <p>
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * <p>
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * You may assume that you have an infinite number of each kind of coin.
 * <p>
 * Example 1:
 * <p>
 * Input: coins = [1,2,5], amount = 11
 * <p>
 * Output: 3
 * <p>
 * Explanation: 11 = 5 + 5 + 1
 * <p>
 * Example 2:
 * <p>
 * Input: coins = [2], amount = 3
 * <p>
 * Output: -1
 * <p>
 * Example 3:
 * <p>
 * Input: coins = [1], amount = 0
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 2^31 - 1
 * 0 <= amount <= 10^4
 */
public class CoinChange {
    private int[][] DP;


    public static void main(String[] args) throws Exception {
        int[] coins = {1, 2, 5};
        System.out.println(new CoinChange().coinChange(coins, 11));
    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                int prev = dp[i - coin];
                if (prev > 0) {
                    if (dp[i] == 0) {
                        dp[i] = prev + 1;
                    } else {
                        dp[i] = Math.min(dp[i], prev + 1);
                    }
                }
            }
        }
        return dp[amount] - 1;
    }
}
