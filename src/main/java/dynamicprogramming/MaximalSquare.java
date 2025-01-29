package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 * <p>
 * Example 1:
 * <p>
 * Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * <p>
 * Output: 4
 * <p>
 * Example 2:
 * <p>
 * Input: matrix = [["0","1"],["1","0"]]
 * <p>
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: matrix = [["0"]]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] is '0' or '1'.
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, maxSide = 0;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }
        return maxSide * maxSide;
    }
}
