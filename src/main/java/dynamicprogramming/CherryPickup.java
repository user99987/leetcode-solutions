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
        int[][][] dp = new int[n][n][n];
        return Math.max(0, dfs(grid, dp, 0, 0, 0));
    }

    private int dfs(int[][] grid, int[][][] dp, int r1, int c1, int r2) {
        int c2 = r1 + c1 - r2;
        int n = grid.length;
        if (r1 >= n || r2 >= n || c1 >= n || c2 >= n || grid[r1][c1] == -1 || grid[r2][c2] == -1)
            return Integer.MIN_VALUE;
        if (r1 == n - 1 && c1 == n - 1) return grid[r1][c1];
        if (dp[r1][c1][r2] != 0) return dp[r1][c1][r2];

        int cherries = grid[r1][c1] + (r1 != r2 ? grid[r2][c2] : 0);
        int maxCherries = Math.max(Math.max(dfs(grid, dp, r1 + 1, c1, r2 + 1), dfs(grid, dp, r1, c1 + 1, r2)),
                Math.max(dfs(grid, dp, r1 + 1, c1, r2), dfs(grid, dp, r1, c1 + 1, r2 + 1)));

        return dp[r1][c1][r2] = cherries + maxCherries;
    }
}
