package backtracking

/**
 * Hard
 *
 * Given a string board representing the row of balls on a Zuma board, and a string hand
 * representing the balls in your hand, return the minimum number of balls you have to insert to
 * clear all the balls from the board, or -1 if it cannot be done.
 */
class ZumaGameK {

    fun findMinStep(board: String, hand: String): Int {
        val handMap = HashMap<Char, Int>()
        for (c in hand) {
            handMap[c] = handMap.getOrDefault(c, 0) + 1
        }
        return backtrack(board, handMap)
    }

    private fun backtrack(board: String, handMap: MutableMap<Char, Int>): Int {
        if (board.isEmpty()) {
            return 0
        }
        if (handMap.values.all { it == 0 }) {
            return -1
        }
        var minSteps = Int.MAX_VALUE
        for (i in board.indices) {
            val c = board[i]
            if (handMap.getOrDefault(c, 0) > 0) {
                handMap[c] = handMap[c]!! - 1
                val newBoard = removeConsecutive(board.substring(0, i) + c + board.substring(i))
                val nextSteps = backtrack(newBoard, handMap)
                if (nextSteps != -1) {
                    minSteps = minOf(minSteps, nextSteps + 1)
                }
                handMap[c] = handMap[c]!! + 1
            }
        }
        return if (minSteps == Int.MAX_VALUE) -1 else minSteps
    }

    private fun removeConsecutive(input: String): String {
        var board = input
        var prev: String
        do {
            prev = board
            board = board.replace(Regex("(.)\\1{2,}"), "")
        } while (board != prev)
        return board
    }
}

