package dynamicprogramming;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
 * <p>
 * Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
 * <p>
 * Output: 6
 * <p>
 * Example 2:
 * <p>
 * Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
 * <p>
 * Output: 12
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 50
 * 0 <= maxMove <= 50
 * 0 <= startRow < m
 * 0 <= startColumn < n
 */
public class OutOfBoundaryPaths {

    private static final int MOD = 1_000_000_007;
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int findPaths(int m, int n, int maxMoves, int startRow, int startCol) {
        int[][][] dp = new int[m][n][maxMoves + 1];
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        return dfs(m, n, maxMoves, startRow, startCol, dp);
    }

    private int dfs(int m, int n, int remainingMoves, int row, int col, int[][][] dp) {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1;
        }
        if (remainingMoves == 0) {
            return 0;
        }
        if (dp[row][col][remainingMoves] != -1) {
            return dp[row][col][remainingMoves];
        }

        int paths = 0;
        for (int[] dir : DIRECTIONS) {
            paths = (paths + dfs(m, n, remainingMoves - 1, row + dir[0], col + dir[1], dp)) % MOD;
        }

        return dp[row][col][remainingMoves] = paths;
    }
}
