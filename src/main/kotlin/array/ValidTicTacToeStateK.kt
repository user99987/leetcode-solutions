package array

/**
 * Medium
 *
 * Given a Tic-Tac-Toe board, return true if and only if it is possible to reach this board
 * position during the course of a valid tic-tac-toe game.
 */
class ValidTicTacToeStateK {

    fun validTicTacToe(board: Array<String>): Boolean {
        val xWon = hasWon(board, 'X')
        val oWon = hasWon(board, 'O')
        var xCount = 0
        var oCount = 0

        for (row in board) {
            for (c in row) {
                if (c == 'X') xCount++ else if (c == 'O') oCount++
            }
        }

        if (oCount > xCount || xCount > oCount + 1) return false
        if (xWon && oWon) return false
        if (xWon && xCount == oCount) return false
        return !oWon || xCount <= oCount
    }

    private fun hasWon(board: Array<String>, c: Char): Boolean {
        for (i in 0 until 3) {
            if (board[i][0] == c && board[i][1] == c && board[i][2] == c) return true
            if (board[0][i] == c && board[1][i] == c && board[2][i] == c) return true
        }
        return (board[0][0] == c && board[1][1] == c && board[2][2] == c) ||
            (board[0][2] == c && board[1][1] == c && board[2][0] == c)
    }
}

