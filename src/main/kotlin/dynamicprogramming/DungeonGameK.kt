package dynamicprogramming

import kotlin.math.max
import kotlin.math.min

/**
 * Hard
 *
 * Return the knight's minimum initial health so that he can rescue the princess in the
 * bottom-right corner of the dungeon.
 */
class DungeonGameK {

    fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val m = dungeon.size
        val n = dungeon[0].size
        val dp = IntArray(n + 1) { Int.MAX_VALUE }
        dp[n - 1] = 1

        for (i in m - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                val minHP = min(dp[j], dp[j + 1]) - dungeon[i][j]
                dp[j] = max(1, minHP)
            }
        }
        return dp[0]
    }
}

