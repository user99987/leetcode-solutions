package popular;

/**
 * Medium
 * <p>
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * <p>
 * Example 1:
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        int rows = board.length, cols = board[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (search(board, word, row, col, 0)) return true;
            }
        }
        return false;
    }

    private boolean search(char[][] board, String word, int row, int col, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index))
            return false;

        board[row][col] = '#';
        boolean found = search(board, word, row + 1, col, index + 1) ||
                search(board, word, row - 1, col, index + 1) ||
                search(board, word, row, col + 1, index + 1) ||
                search(board, word, row, col - 1, index + 1);
        board[row][col] = word.charAt(index);
        return found;
    }

}
