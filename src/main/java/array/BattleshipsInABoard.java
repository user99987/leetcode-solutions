package array;

/**
 * Medium
 * <p>
 * Given an m x n matrix board where each cell is a battleship 'X' or empty '.', return the number of the battleships on board.
 * <p>
 * Battleships can only be placed horizontally or vertically on board. In other words, they can only be made of the shape 1 x k (1 row, k columns) or k x 1 (k rows, 1 column), where k can be of any size. At least one horizontal or vertical cell separates between two battleships (i.e., there are no adjacent battleships).
 * <p>
 * Example 1:
 * <p>
 * Input: board = [[“X”,”.”,”.”,”X”],[”.”,”.”,”.”,”X”],[”.”,”.”,”.”,”X”]]
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: board = [[”.”]]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] is either '.' or 'X'.
 */
public class BattleshipsInABoard {

    public static void main(String[] args) throws Exception {
        char[][] board = {{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        System.out.println(new BattleshipsInABoard().countBattleships(board));
    }

    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0) {
            return 0;
        }
        int count = 0;
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.'
                        && (j == 0 || board[i][j - 1] != 'X')
                        && (i <= 0 || board[i - 1][j] != 'X')) {
                    count++;
                }
            }
        }
        return count;
    }
}
