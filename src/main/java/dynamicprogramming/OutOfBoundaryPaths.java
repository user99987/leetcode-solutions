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

    private final int[][] dRowCol = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        System.out.println(new OutOfBoundaryPaths().findPaths(2, 2, 2, 0, 0));
    }

    private int dfs(int m, int n, int remainingMoves, int currRow, int currCol, int[][][] cache) {
        if (currRow < 0 || currRow == m || currCol < 0 || currCol == n) {
            return 1;
        }
        if (remainingMoves == 0) {
            return 0;
        }

        if (cache[currRow][currCol][remainingMoves] == -1) {
            int paths = 0;
            for (int i = 0; i < 4; i++) {
                int newRow = currRow + dRowCol[i][0];
                int newCol = currCol + dRowCol[i][1];
                int m1 = 1000000007;
                paths = (paths + dfs(m, n, remainingMoves - 1, newRow, newCol, cache)) % m1;
            }
            cache[currRow][currCol][remainingMoves] = paths;
        }
        return cache[currRow][currCol][remainingMoves];
    }

    public int findPaths(int m, int n, int maxMoves, int startRow, int startCol) {
        int[][][] cache = new int[m][n][maxMoves + 1];
        for (int[][] c1 : cache) {
            for (int[] c2 : c1) {
                Arrays.fill(c2, -1);
            }
        }

        return dfs(m, n, maxMoves, startRow, startCol, cache);
    }
}
