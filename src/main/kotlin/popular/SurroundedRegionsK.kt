package popular

/**
 * Medium
 * Surrounded Regions
 */
class SurroundedRegionsK {

    fun solve(board: Array<CharArray>?) {
        if (board == null || board.isEmpty()) return

        val rows = board.size
        val cols = board[0].size

        for (r in 0 until rows) {
            dfs(board, r, 0, rows, cols)
            dfs(board, r, cols - 1, rows, cols)
        }
        for (c in 0 until cols) {
            dfs(board, 0, c, rows, cols)
            dfs(board, rows - 1, c, rows, cols)
        }

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (board[r][c] == 'O') board[r][c] = 'X'
                else if (board[r][c] == 'E') board[r][c] = 'O'
            }
        }
    }

    private fun dfs(board: Array<CharArray>, row: Int, col: Int, rows: Int, cols: Int) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != 'O') return

        board[row][col] = 'E'

        dfs(board, row, col + 1, rows, cols)
        dfs(board, row + 1, col, rows, cols)
        dfs(board, row, col - 1, rows, cols)
        dfs(board, row - 1, col, rows, cols)
    }
}

