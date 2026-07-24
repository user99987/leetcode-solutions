package dynamicprogramming

/**
 * Medium
 *
 * There is an m x n grid with a ball. The ball is initially at the position [startRow, startColumn]. You are allowed to move the ball to one of the four adjacent cells in the grid (possibly out of the grid crossing the grid boundary). You can apply at most maxMove moves to the ball.
 *
 * Given the five integers m, n, maxMove, startRow, startColumn, return the number of paths to move the ball out of the grid boundary. Since the answer can be very large, return it modulo 109 + 7.
 *
 * Example 1:
 *
 * Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
 *
 * Output: 6
 *
 * Example 2:
 *
 * Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
 *
 * Output: 12
 *
 * Constraints:
 *
 * 1 <= m, n <= 50
 * 0 <= maxMove <= 50
 * 0 <= startRow < m
 * 0 <= startColumn < n
 */
class OutOfBoundaryPathsK {

    fun findPaths(m: Int, n: Int, maxMoves: Int, startRow: Int, startCol: Int): Int {
        val dp = Array(m) { Array(n) { IntArray(maxMoves + 1) { -1 } } }
        return dfs(m, n, maxMoves, startRow, startCol, dp)
    }

    private fun dfs(m: Int, n: Int, remainingMoves: Int, row: Int, col: Int, dp: Array<Array<IntArray>>): Int {
        if (row < 0 || row >= m || col < 0 || col >= n) {
            return 1
        }
        if (remainingMoves == 0) {
            return 0
        }
        if (dp[row][col][remainingMoves] != -1) {
            return dp[row][col][remainingMoves]
        }

        var paths = 0
        for (dir in DIRECTIONS) {
            paths = (paths + dfs(m, n, remainingMoves - 1, row + dir[0], col + dir[1], dp)) % MOD
        }

        dp[row][col][remainingMoves] = paths
        return paths
    }

    companion object {
        private const val MOD = 1_000_000_007
        private val DIRECTIONS = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    }
}

