package popular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Medium
 * <p>
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 * <p>
 * Example 1:
 * <p>
 * Input: board = [[“X”,”X”,”X”,”X”],[“X”,”O”,”O”,”X”],[“X”,”X”,”O”,”X”],[“X”,”O”,”X”,”X”]]
 * <p>
 * Output: [[“X”,”X”,”X”,”X”],[“X”,”X”,”X”,”X”],[“X”,”X”,”X”,”X”],[“X”,”O”,”X”,”X”]]
 * <p>
 * Explanation: Surrounded regions should not be on the border, which means that any ‘O’ on the border of the board are not flipped to ‘X’. Any ‘O’ that is not on the border and it is not connected to an ‘O’ on the border will be flipped to ‘X’. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 * <p>
 * Example 2:
 * <p>
 * Input: board = [[“X”]]
 * <p>
 * Output: [[“X”]]
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is 'X' or 'O'.
 */
public class SurroundedRegions {

    public static void main(String[] args) throws Exception {
        char[][] board = new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        new SurroundedRegions().solve(board);
        System.out.println(Arrays.deepToString(board));
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int rows = board.length;
        int cols = board[0].length;
        List<List<Integer>> borders = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            borders.add(Arrays.asList(r, 0));
            borders.add(Arrays.asList(r, cols - 1));
        }
        for (int c = 0; c < cols; c++) {
            borders.add(Arrays.asList(0, c));
            borders.add(Arrays.asList(rows - 1, c));
        }
        for (List<Integer> border : borders) {
            dfs(board, border.get(0), border.get(1), rows, cols);
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                }
                if (board[r][c] == 'E') {
                    board[r][c] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col, int rows, int cols) {
        if (board[row][col] != 'O') {
            return;
        }
        board[row][col] = 'E';
        if (col < cols - 1) {
            dfs(board, row, col + 1, rows, cols);
        }
        if (row < rows - 1) {
            dfs(board, row + 1, col, rows, cols);
        }
        if (col > 0) {
            dfs(board, row, col - 1, rows, cols);
        }
        if (row > 0) {
            dfs(board, row - 1, col, rows, cols);
        }
    }
}
