package greedy

import kotlin.math.max

/**
 * Medium
 *
 * Return the highest possible score after making any number of row/column toggle moves
 * (including zero moves) on the binary matrix grid.
 */
class ScoreAfterFlippingMatrixK {

    fun matrixScore(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var score = (1 shl (n - 1)) * m

        for (j in 1 until n) {
            var count = 0
            for (row in grid) {
                count += if (row[0] == row[j]) 1 else 0
            }
            score += max(count, m - count) * (1 shl (n - 1 - j))
        }
        return score
    }
}

