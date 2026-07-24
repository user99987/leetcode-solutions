package array

import kotlin.math.min

/**
 * Medium
 *
 * Return how full the jth glass in the ith row of a champagne tower is after pouring the given
 * number of cups.
 */
class ChampagneTowerK {

    fun champagneTower(poured: Int, queryRow: Int, queryGlass: Int): Double {
        var currentRow = doubleArrayOf(poured.toDouble())

        for (row in 0 until queryRow) {
            val nextRow = DoubleArray(row + 2)

            for (glass in currentRow.indices) {
                val overflow = currentRow[glass] - 1
                if (overflow > 0) {
                    nextRow[glass] += overflow / 2
                    nextRow[glass + 1] += overflow / 2
                }
            }

            currentRow = nextRow
        }

        return min(1.0, currentRow[queryGlass])
    }
}

