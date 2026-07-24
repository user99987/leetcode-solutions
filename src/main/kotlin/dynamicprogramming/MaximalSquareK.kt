package dynamicprogramming

/**
 * Medium
 *
 * Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
 *
 * Example 1:
 *
 * Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 *
 * Output: 4
 *
 * Example 2:
 *
 * Input: matrix = [["0","1"],["1","0"]]
 *
 * Output: 1
 *
 * Example 3:
 *
 * Input: matrix = [["0"]]
 *
 * Output: 0
 *
 * Constraints:
 *
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 300
 * matrix[i][j] is '0' or '1'.
 */
class MaximalSquareK {

    fun maximalSquare(matrix: Array<CharArray>): Int {
        val m = matrix.size
        val n = matrix[0].size
        var maxSide = 0
        val dp = IntArray(n + 1)

        for (i in 1..m) {
            var prevDiagonal = 0
            for (j in 1..n) {
                val saved = dp[j]
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = minOf(minOf(dp[j], dp[j - 1]), prevDiagonal) + 1
                    maxSide = maxOf(maxSide, dp[j])
                } else {
                    dp[j] = 0
                }
                prevDiagonal = saved
            }
        }
        return maxSide * maxSide
    }
}

