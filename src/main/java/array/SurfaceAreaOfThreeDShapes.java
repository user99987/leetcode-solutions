package array;

/**
 * Easy
 * <p>
 * You are given an n x n grid where you have placed some 1 x 1 x 1 cubes. Each value v = grid[i][j] represents a tower of v cubes placed on top of cell (i, j).
 * <p>
 * After placing these cubes, you have decided to glue any directly adjacent cubes to each other, forming several irregular 3D shapes.
 * <p>
 * Return the total surface area of the resulting shapes.
 * <p>
 * Note: The bottom face of each shape counts toward its surface area.
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [[1,2],[3,4]]
 * <p>
 * Output: 34
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
 * <p>
 * Output: 32
 * <p>
 * Example 3:
 * <p>
 * Input: grid = [[2,2,2],[2,1,2],[2,2,2]]
 * <p>
 * Output: 46
 * <p>
 * Constraints:
 * <p>
 * n == grid.length == grid[i].length
 * 1 <= n <= 50
 * 0 <= grid[i][j] <= 50
 */
public class SurfaceAreaOfThreeDShapes {

    public int surfaceArea(int[][] grid) {
        int surfaceArea = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    surfaceArea += 4 * grid[i][j] + 2;
                    if (i > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
                    }
                    if (j > 0) {
                        surfaceArea -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                    }
                }
            }
        }

        return surfaceArea;
    }
}
