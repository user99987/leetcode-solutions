package popular;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input:
 * <p>
 * board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input:
 * <p>
 * board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * <p>
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * <p>
 * Constraints:
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 */
public class ValidSudoku {


    private static final int SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[SIZE][SIZE], cols = new int[SIZE][SIZE], boxes = new int[SIZE][SIZE];

        return IntStream.range(0, SIZE).allMatch(r ->
                IntStream.range(0, SIZE).allMatch(c -> isValid(board, r, c, rows, cols, boxes))
        );
    }

    private boolean isValid(char[][] board, int row, int col, int[][] rows, int[][] cols, int[][] boxes) {
        if (board[row][col] == '.') return true;
        int num = board[row][col] - '1', boxIndex = (row / 3) * 3 + col / 3;
        if (rows[row][num] == 1 || cols[col][num] == 1 || boxes[boxIndex][num] == 1) return false;
        rows[row][num] = cols[col][num] = boxes[boxIndex][num] = 1;
        return true;
    }
}
