package popular;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * <p>
 * grid = [
 * ["1","1","1","1","0"],
 * ["1","1","0","1","0"],
 * ["1","1","0","0","0"],
 * ["0","0","0","0","0"]
 * ]
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input:
 * <p>
 * grid = [
 * ["1","1","0","0","0"],
 * ["1","1","0","0","0"],
 * ["0","0","1","0","0"],
 * ["0","0","0","1","1"]
 * ]
 * Output: 3
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        return grid == null || grid.length == 0 ? 0 :
                IntStream.range(0, grid.length)
                        .flatMap(i -> IntStream.range(0, grid[0].length)
                                .filter(j -> grid[i][j] == '1')
                                .map(j -> {
                                    dfs(grid, i, j);
                                    return 1;
                                }))
                        .sum();
    }

    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != '1') {
            return;
        }
        grid[x][y] = 'x';
        IntStream.of(-1, 1).forEach(d -> {
            dfs(grid, x + d, y);
            dfs(grid, x, y + d);
        });
    }
}
