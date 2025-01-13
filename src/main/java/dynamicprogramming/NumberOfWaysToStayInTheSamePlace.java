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
 * 1 <= arrLen <= 106
 */
public class NumberOfWaysToStayInTheSamePlace {

    private static final int MOD = (int) (1e9 + 7);
    int[][] DP;

    public static void main(String[] args) {
        System.out.println(new NumberOfWaysToStayInTheSamePlace().numWays(500, 1000000));
    }

    public int numWays(int steps, int arrLen) {
        int colLimit = Math.min(arrLen, steps);
        DP = new int[colLimit + 1][steps + 1];
        for (int i = 0; i <= colLimit; i++) {
            Arrays.fill(DP[i], -1);
        }
        DP[0][0] = 1;
        return (int) dp(0, steps, arrLen);
    }

    private long dp(int i, int n, int A) {
        if (i < 0 || i >= A) return 0;
        else if (n < 0) return 0;
        if (DP[i][n] != -1) return DP[i][n];
        DP[i][n] =
                (int)
                        (((((dp(i, n - 1, A) % MOD) + (dp(i - 1, n - 1, A) % MOD)) % MOD)
                                + (dp(i + 1, n - 1, A) % MOD))
                                % MOD);
        return DP[i][n];
    }
}
