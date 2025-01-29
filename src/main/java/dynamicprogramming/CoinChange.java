package dynamicprogramming;

import java.util.Arrays;

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
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
