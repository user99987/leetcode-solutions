package dynamicprogramming

import kotlin.math.max
import kotlin.math.min

/**
 * Hard
 *
 * Return the maximum number of cherries you can collect going from (0,0) to (n-1,n-1) and back.
 */
class CherryPickupK {

    fun cherryPickup(grid: Array<IntArray>): Int {
        val n = grid.size
        var dp = Array(n) { IntArray(n) { Int.MIN_VALUE } }
        dp[0][0] = grid[0][0]

        for (step in 1 until 2 * n - 1) {
            val next = Array(n) { IntArray(n) { Int.MIN_VALUE } }

            val minRow = max(0, step - (n - 1))
            val maxRow = min(n - 1, step)
            for (r1 in minRow..maxRow) {
                val c1 = step - r1
                if (grid[r1][c1] == -1) {
                    continue
                }
                for (r2 in minRow..maxRow) {
                    val c2 = step - r2
                    if (grid[r2][c2] == -1) {
                        continue
                    }

                    var best = dp[r1][r2]
                    if (r1 > 0) {
                        best = max(best, dp[r1 - 1][r2])
                    }
                    if (r2 > 0) {
                        best = max(best, dp[r1][r2 - 1])
                    }
                    if (r1 > 0 && r2 > 0) {
                        best = max(best, dp[r1 - 1][r2 - 1])
                    }
                    if (best == Int.MIN_VALUE) {
                        continue
                    }

                    var cherries = best + grid[r1][c1]
                    if (r1 != r2) {
                        cherries += grid[r2][c2]
                    }
                    next[r1][r2] = max(next[r1][r2], cherries)
                }
            }
            dp = next
        }
        return max(0, dp[n - 1][n - 1])
    }
}

