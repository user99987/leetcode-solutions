package dynamicprogramming

import kotlin.math.max

/**
 * Hard
 *
 * Return the maximum coins you can collect by bursting the balloons wisely.
 */
class BurstBalloonsK {

    fun maxCoins(nums: IntArray): Int {
        val n = nums.size
        val dp = Array(n) { IntArray(n) }

        for (gap in 0 until n) {
            var left = 0
            var right = gap
            while (right < n) {
                var maxCoins = 0
                val leftVal = if (left == 0) 1 else nums[left - 1]
                val rightVal = if (right == n - 1) 1 else nums[right + 1]

                for (i in left..right) {
                    val coins = (if (i == left) 0 else dp[left][i - 1]) +
                        leftVal * nums[i] * rightVal +
                        (if (i == right) 0 else dp[i + 1][right])
                    maxCoins = max(maxCoins, coins)
                }
                dp[left][right] = maxCoins
                left++
                right++
            }
        }
        return dp[0][n - 1]
    }
}

