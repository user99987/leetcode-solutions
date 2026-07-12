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

    public double knightProbability(int n, int k, int row, int column) {
        double[][] current = new double[n][n];
        current[row][column] = 1.0;

        for (var move = 0; move < k; move++) {
            double[][] next = new double[n][n];
            for (var r = 0; r < n; r++) {
                for (var c = 0; c < n; c++) {
                    if (current[r][c] == 0) {
                        continue;
                    }
                    double probability = current[r][c] / 8.0;
                    for (var dir : directions) {
                        int nextRow = r + dir[0];
                        int nextColumn = c + dir[1];
                        if (isValid(nextRow, nextColumn, n)) {
                            next[nextRow][nextColumn] += probability;
                        }
                    }
                }
            }
            current = next;
        }

        double answer = 0;
        for (var probabilities : current) {
            for (var probability : probabilities) {
                answer += probability;
            }
        }
        return answer;
    }

    private boolean isValid(int row, int column, int n) {
        return row >= 0 && row < n && column >= 0 && column < n;
    }
}
