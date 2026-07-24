package dynamicprogramming

import kotlin.math.max
import kotlin.math.min

/**
 * Medium
 *
 * Return the order of the largest axis-aligned plus sign of 1's contained in an n x n binary
 * grid with the given mines set to 0.
 */
class LargestPlusSignK {

    fun orderOfLargestPlusSign(n: Int, mines: Array<IntArray>): Int {
        val dp = Array(n) { IntArray(n) { n } }
        for (pos in mines) {
            dp[pos[0]][pos[1]] = 0
        }

        for (i in 0 until n) {
            var count = 0
            for (j in 0 until n) {
                count = if (dp[i][j] == 0) 0 else count + 1
                dp[i][j] = min(dp[i][j], count)
            }
            count = 0
            for (j in n - 1 downTo 0) {
                count = if (dp[i][j] == 0) 0 else count + 1
                dp[i][j] = min(dp[i][j], count)
            }
        }

        var ans = 0
        for (j in 0 until n) {
            var count = 0
            for (i in 0 until n) {
                count = if (dp[i][j] == 0) 0 else count + 1
                dp[i][j] = min(dp[i][j], count)
            }
            count = 0
            for (i in n - 1 downTo 0) {
                count = if (dp[i][j] == 0) 0 else count + 1
                dp[i][j] = min(dp[i][j], count)
                ans = max(ans, dp[i][j])
            }
        }
        return ans
    }
}

