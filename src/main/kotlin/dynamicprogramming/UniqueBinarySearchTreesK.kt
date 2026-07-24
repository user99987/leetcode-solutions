package dynamicprogramming

/**
 * Medium
 *
 * Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
 *
 * Example 1:
 *
 * Input: n = 3
 *
 * Output: 5
 *
 * Example 2:
 *
 * Input: n = 1
 *
 * Output: 1
 *
 * Constraints:
 *
 * 1 <= n <= 19
 */
class UniqueBinarySearchTreesK {

    fun numTrees(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[0] = 1
        if (n >= 1) dp[1] = 1

        for (i in 2..n) {
            for (j in 0 until i) {
                dp[i] += dp[j] * dp[i - j - 1]
            }
        }
        return dp[n]
    }
}

