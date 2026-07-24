package array

/**
 * Medium
 *
 * Given an m x n matrix board where each cell is a battleship 'X' or empty '.', return the
 * number of the battleships on board.
 */
class BattleshipsInABoardK {

    fun countBattleships(board: Array<CharArray>?): Int {
        if (board == null || board.isEmpty()) {
            return 0
        }

        var count = 0
        val rows = board.size
        val cols = board[0].size

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (board[i][j] == 'X' &&
                    (j == 0 || board[i][j - 1] != 'X') &&
                    (i == 0 || board[i - 1][j] != 'X')
                ) {
                    count++
                }
            }
        }

        return count
    }
}

