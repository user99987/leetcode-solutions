package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * You have a pointer at index 0 in an array of size arrLen. At each step, you can move 1 position to the left, 1 position to the right in the array, or stay in the same place (The pointer should not be placed outside the array at any time).
 * <p>
 * Given two integers steps and arrLen, return the number of ways such that your pointer still at index 0 after exactly steps steps. Since the answer may be too large, return it modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: steps = 3, arrLen = 2
 * <p>
 * Output: 4
 * <p>
 * Explanation: There are 4 differents ways to stay at index 0 after 3 steps.
 * <p>
 * Right, Left, Stay
 * <p>
 * Stay, Right, Left
 * <p>
 * Right, Stay, Left
 * <p>
 * Stay, Stay, Stay
 * <p>
 * Example 2:
 * <p>
 * Input: steps = 2, arrLen = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation: There are 2 differents ways to stay at index 0 after 2 steps
 * <p>
 * Right, Left
 * <p>
 * Stay, Stay
 * <p>
 * Example 3:
 * <p>
 * Input: steps = 4, arrLen = 2
 * <p>
 * Output: 8
 * <p>
 * Constraints:
 * <p>
 * 1 <= steps <= 500
 * 1 <= arrLen <= 10^6
 */
public class NumberOfWaysToStayInTheSamePlace {

    private static final int MOD = 1_000_000_007;
    private int[][] dp;

    public int numWays(int steps, int arrLen) {
        int maxPos = Math.min(arrLen - 1, steps / 2);
        dp = new int[steps + 1][maxPos + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return findWays(steps, 0, maxPos);
    }

    private int findWays(int remainingSteps, int position, int maxPos) {
        if (remainingSteps == 0) {
            return position == 0 ? 1 : 0;
        }
        if (dp[remainingSteps][position] != -1) {
            return dp[remainingSteps][position];
        }

        int ways = findWays(remainingSteps - 1, position, maxPos);
        if (position > 0) {
            ways = (ways + findWays(remainingSteps - 1, position - 1, maxPos)) % MOD;
        }
        if (position < maxPos) {
            ways = (ways + findWays(remainingSteps - 1, position + 1, maxPos)) % MOD;
        }

        return dp[remainingSteps][position] = ways;
    }
}
