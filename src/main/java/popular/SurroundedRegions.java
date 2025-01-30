package popular;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * Example 1:
 * <p>
 * Input: board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * <p>
 * Output: [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * <p>
 * Explanation: Surrounded regions should not be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 * <p>
 * Example 2:
 * <p>
 * Input: board = [["X"]]
 * <p>
 * Output: [["X"]]
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is 'X' or 'O'.
 */
public class SurroundedRegions {

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length, cols = board[0].length;
        List<int[]> borders = new ArrayList<>();

        IntStream.range(0, rows).forEach(r -> {
            borders.add(new int[]{r, 0});
            borders.add(new int[]{r, cols - 1});
        });

        IntStream.range(0, cols).forEach(c -> {
            borders.add(new int[]{0, c});
            borders.add(new int[]{rows - 1, c});
        });

        borders.forEach(border -> dfs(board, border[0], border[1], rows, cols));

        IntStream.range(0, rows).forEach(r ->
                IntStream.range(0, cols).forEach(c -> {
                    if (board[r][c] == 'O') board[r][c] = 'X';
                    else if (board[r][c] == 'E') board[r][c] = 'O';
                })
        );
    }

    private void dfs(char[][] board, int row, int col, int rows, int cols) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != 'O') return;

        board[row][col] = 'E';

        dfs(board, row, col + 1, rows, cols);
        dfs(board, row + 1, col, rows, cols);
        dfs(board, row, col - 1, rows, cols);
        dfs(board, row - 1, col, rows, cols);
    }
}
