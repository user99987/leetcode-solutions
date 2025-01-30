package popular;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>
 * How many possible unique paths are there?
 * <p>
 * Example 1:
 * <p>
 * Input: m = 3, n = 7
 * <p>
 * Output: 28
 * <p>
 * Example 2:
 * <p>
 * Input: m = 3, n = 2
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 * Example 3:
 * <p>
 * Input: m = 7, n = 3
 * <p>
 * Output: 28
 * <p>
 * Example 4:
 * <p>
 * Input: m = 3, n = 3
 * <p>
 * Output: 6
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 100
 * It's guaranteed that the answer will be less than or equal to 2 * 10^9.
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        IntStream.range(0, m).forEach(i -> dp[i][0] = 1);
        IntStream.range(0, n).forEach(j -> dp[0][j] = 1);
        IntStream.range(1, m).forEach(i ->
                IntStream.range(1, n).forEach(j ->
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
                )
        );
        return dp[m - 1][n - 1];
    }
}
