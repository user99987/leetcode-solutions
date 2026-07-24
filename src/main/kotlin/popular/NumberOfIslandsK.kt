package popular

/**
 * Medium
 * Number of Islands
 */
class NumberOfIslandsK {

    fun numIslands(grid: Array<CharArray>?): Int {
        if (grid == null || grid.isEmpty()) return 0
        var count = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j)
                    count++
                }
            }
        }
        return count
    }

    private fun dfs(grid: Array<CharArray>, x: Int, y: Int) {
        if (x < 0 || x >= grid.size || y < 0 || y >= grid[0].size || grid[x][y] != '1') {
            return
        }
        grid[x][y] = 'x'
        for (d in intArrayOf(-1, 1)) {
            dfs(grid, x + d, y)
            dfs(grid, x, y + d)
        }
    }
}

