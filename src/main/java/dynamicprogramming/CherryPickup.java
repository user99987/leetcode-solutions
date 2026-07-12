package dynamicprogramming;

/**
 * Hard
 * <p>
 * You are given an n x n grid representing a field of cherries, each cell is one of three possible integers.
 * <p>
 * 0 means the cell is empty, so you can pass through,
 * 1 means the cell contains a cherry that you can pick up and pass through, or
 * -1 means the cell contains a thorn that blocks your way.
 * Return the maximum number of cherries you can collect by following the rules below:
 * <p>
 * Starting at the position (0, 0) and reaching (n - 1, n - 1) by moving right or down through valid path cells (cells with value 0 or 1).
 * After reaching (n - 1, n - 1), returning to (0, 0) by moving left or up through valid path cells.
 * When passing through a path cell containing a cherry, you pick it up, and the cell becomes an empty cell 0.
 * If there is no valid path between (0, 0) and (n - 1, n - 1), then no cherries can be collected.
 * Example 1:
 * <p>
 * Input: grid = [[0,1,-1],[1,0,-1],[1,1,1]]
 * <p>
 * Output: 5
 * <p>
 * Explanation: The player started at (0, 0) and went down, down, right right to reach (2, 2). 4 cherries were picked up during this single trip, and the matrix becomes [[0,1,-1],[0,0,-1],[0,0,0]]. Then, the player went left, up, up, left to return home, picking up one more cherry. The total number of cherries picked up is 5, and this is the maximum possible.
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [[1,1,-1],[1,-1,1],[-1,1,1]]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 50
 * grid[i][j] is -1, 0, or 1.
 * grid[0][0] != -1
 * grid[n - 1][n - 1] != -1
 */
public class CherryPickup {

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (var r1 = 0; r1 < n; r1++) {
            for (var r2 = 0; r2 < n; r2++) {
                dp[r1][r2] = Integer.MIN_VALUE;
            }
        }
        dp[0][0] = grid[0][0];

        for (var step = 1; step < 2 * n - 1; step++) {
            int[][] next = new int[n][n];
            for (var r1 = 0; r1 < n; r1++) {
                for (var r2 = 0; r2 < n; r2++) {
                    next[r1][r2] = Integer.MIN_VALUE;
                }
            }

            int minRow = Math.max(0, step - (n - 1));
            int maxRow = Math.min(n - 1, step);
            for (var r1 = minRow; r1 <= maxRow; r1++) {
                int c1 = step - r1;
                if (grid[r1][c1] == -1) {
                    continue;
                }
                for (var r2 = minRow; r2 <= maxRow; r2++) {
                    int c2 = step - r2;
                    if (grid[r2][c2] == -1) {
                        continue;
                    }

                    int best = dp[r1][r2];
                    if (r1 > 0) {
                        best = Math.max(best, dp[r1 - 1][r2]);
                    }
                    if (r2 > 0) {
                        best = Math.max(best, dp[r1][r2 - 1]);
                    }
                    if (r1 > 0 && r2 > 0) {
                        best = Math.max(best, dp[r1 - 1][r2 - 1]);
                    }
                    if (best == Integer.MIN_VALUE) {
                        continue;
                    }

                    int cherries = best + grid[r1][c1];
                    if (r1 != r2) {
                        cherries += grid[r2][c2];
                    }
                    next[r1][r2] = Math.max(next[r1][r2], cherries);
                }
            }
            dp = next;
        }
        return Math.max(0, dp[n - 1][n - 1]);
    }
}
