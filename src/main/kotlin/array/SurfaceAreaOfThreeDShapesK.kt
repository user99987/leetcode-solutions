package array

import kotlin.math.min

/**
 * Easy
 *
 * Return the total surface area of the 3D shapes formed by gluing adjacent cube towers.
 */
class SurfaceAreaOfThreeDShapesK {

    fun surfaceArea(grid: Array<IntArray>): Int {
        var surfaceArea = 0
        val n = grid.size

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (grid[i][j] > 0) {
                    surfaceArea += 4 * grid[i][j] + 2
                    if (i > 0) {
                        surfaceArea -= 2 * min(grid[i][j], grid[i - 1][j])
                    }
                    if (j > 0) {
                        surfaceArea -= 2 * min(grid[i][j], grid[i][j - 1])
                    }
                }
            }
        }

        return surfaceArea
    }
}

