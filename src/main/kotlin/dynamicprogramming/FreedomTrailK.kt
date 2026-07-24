package dynamicprogramming

import kotlin.math.abs
import kotlin.math.min

/**
 * Hard
 *
 * Return the minimum number of steps to spell all the characters in key by rotating ring.
 */
class FreedomTrailK {

    private lateinit var dp: Array<IntArray>

    fun findRotateSteps(ring: String, key: String): Int {
        dp = Array(ring.length) { IntArray(key.length) }
        return calculateSteps(0, 0, ring, key) + key.length
    }

    private fun calculateSteps(i: Int, j: Int, ring: String, key: String): Int {
        if (j == key.length) return 0
        if (dp[i][j] != 0) return dp[i][j]

        val target = key[j]
        var minSteps = Int.MAX_VALUE
        for (k in ring.indices) {
            if (ring[k] == target) {
                val steps = min(abs(i - k), ring.length - abs(i - k))
                minSteps = min(minSteps, steps + calculateSteps(k, j + 1, ring, key))
            }
        }
        dp[i][j] = minSteps
        return minSteps
    }
}

