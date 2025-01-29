package dynamicprogramming;

/**
 * Medium
 * <p>
 * On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves. The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).
 * <p>
 * A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a cardinal direction, then one cell in an orthogonal direction.
 * <p>
 * <p>
 * <p>
 * Each time the knight is to move, it chooses one of eight possible moves uniformly at random (even if the piece would go off the chessboard) and moves there.
 * <p>
 * The knight continues moving until it has made exactly k moves or has moved off the chessboard.
 * <p>
 * Return the probability that the knight remains on the board after it has stopped moving.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3, k = 2, row = 0, column = 0
 * <p>
 * Output: 0.06250
 * <p>
 * Explanation: There are two moves (to (1,2), (2,1)) that will keep the knight on the board. From each of those positions, there are also two moves that will keep the knight on the board. The total probability the knight stays on the board is 0.0625.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1, k = 0, row = 0, column = 0
 * <p>
 * Output: 1.00000
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 25
 * 0 <= k <= 100
 * 0 <= row, column <= n
 */
public class KnightProbabilityInChessboard {

    private final int[][] directions =
            {{-2, -1}, {-2, 1}, {-1, 2}, {1, 2}, {2, -1}, {2, 1}, {1, -2}, {-1, -2}};
    private double[][][] probabilityGiven;

    public double knightProbability(int n, int k, int row, int column) {
        probabilityGiven = new double[n][n][k + 1];
        return probability(row, column, k, n);
    }

    private double probability(int row, int column, int k, int n) {
        if (k == 0) return 1.0;
        if (probabilityGiven[row][column][k] != 0) return probabilityGiven[row][column][k];

        double p = 0;
        for (int[] dir : directions) {
            if (isValid(row + dir[0], column + dir[1], n)) {
                p += probability(row + dir[0], column + dir[1], k - 1, n);
            }
        }
        return probabilityGiven[row][column][k] = p / 8.0;
    }

    private boolean isValid(int row, int column, int n) {
        return row >= 0 && row < n && column >= 0 && column < n;
    }
}
