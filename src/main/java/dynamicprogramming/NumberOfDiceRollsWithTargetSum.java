package dynamicprogramming;

/**
 * Medium
 * <p>
 * You have n dice and each die has k faces numbered from 1 to k.
 * <p>
 * Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1, k = 6, target = 3
 * <p>
 * Output: 1
 * <p>
 * Explanation: You throw one die with 6 faces.
 * <p>
 * There is only one way to get a sum of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2, k = 6, target = 7
 * <p>
 * Output: 6
 * <p>
 * Explanation: You throw two dice, each with 6 faces.
 * <p>
 * There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 30, k = 30, target = 500
 * <p>
 * Output: 222616187
 * <p>
 * Explanation: The answer must be returned modulo 109 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n, k <= 30
 * 1 <= target <= 1000
 */
public class NumberOfDiceRollsWithTargetSum {

    private static final int MOD = 1_000_000_007;

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];

        for (int i = 1; i <= Math.min(k, target); i++) {
            dp[1][i] = 1;
        }

        for (int dice = 2; dice <= n; dice++) {
            for (int sum = 1; sum <= target; sum++) {
                for (int face = 1; face <= Math.min(k, sum); face++) {
                    dp[dice][sum] = (dp[dice][sum] + dp[dice - 1][sum - face]) % MOD;
                }
            }
        }
        return dp[n][target];
    }
}
