package greedy;

/**
 * Medium
 * <p>
 * You are given an m x n binary matrix grid.
 * <p>
 * A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
 * <p>
 * Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 * <p>
 * Return the highest possible score after making any number of moves (including zero moves).
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * <p>
 * Output: 39
 * <p>
 * Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [[0]]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 20
 * grid[i][j] is either 0 or 1.
 */
public class ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int score = (1 << (n - 1)) * m;

        for (int j = 1; j < n; j++) {
            int count = 0;
            for (int[] ints : grid) {
                count += ints[0] == ints[j] ? 1 : 0;
            }
            score += Math.max(count, m - count) * (1 << (n - 1 - j));
        }
        return score;
    }
}
