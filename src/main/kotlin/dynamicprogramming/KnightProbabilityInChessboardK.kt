package dynamicprogramming

/**
 * Medium
 *
 * Return the probability that the knight remains on the board after making exactly k moves,
 * moving uniformly at random.
 */
class KnightProbabilityInChessboardK {

    private val directions = arrayOf(
        intArrayOf(-2, -1), intArrayOf(-2, 1), intArrayOf(-1, 2), intArrayOf(1, 2),
        intArrayOf(2, -1), intArrayOf(2, 1), intArrayOf(1, -2), intArrayOf(-1, -2),
    )

    fun knightProbability(n: Int, k: Int, row: Int, column: Int): Double {
        var current = Array(n) { DoubleArray(n) }
        current[row][column] = 1.0

        for (move in 0 until k) {
            val next = Array(n) { DoubleArray(n) }
            for (r in 0 until n) {
                for (c in 0 until n) {
                    if (current[r][c] == 0.0) {
                        continue
                    }
                    val probability = current[r][c] / 8.0
                    for (dir in directions) {
                        val nextRow = r + dir[0]
                        val nextColumn = c + dir[1]
                        if (isValid(nextRow, nextColumn, n)) {
                            next[nextRow][nextColumn] += probability
                        }
                    }
                }
            }
            current = next
        }

        var answer = 0.0
        for (probabilities in current) {
            for (probability in probabilities) {
                answer += probability
            }
        }
        return answer
    }

    private fun isValid(row: Int, column: Int, n: Int): Boolean =
        row >= 0 && row < n && column >= 0 && column < n
}

