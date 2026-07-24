package binarysearch

import java.util.PriorityQueue
import kotlin.math.max

/**
 * Hard
 *
 * Return the least time until you can reach the bottom right square (n - 1, n - 1) if you start
 * at the top left square (0, 0), using binary search on the water level via a priority queue.
 */
class SwimInRisingWaterK {

    private val directions = intArrayOf(-1, 0, 1, 0, -1)

    fun swimInWater(grid: Array<IntArray>): Int {
        val n = grid.size
        val pq = PriorityQueue<IntArray>(compareBy { it[2] })
        val visited = Array(n) { BooleanArray(n) }

        pq.offer(intArrayOf(0, 0, grid[0][0]))
        visited[0][0] = true

        while (pq.isNotEmpty()) {
            val cell = pq.poll()
            val x = cell[0]
            val y = cell[1]
            val elevation = cell[2]

            if (x == n - 1 && y == n - 1) return elevation

            for (i in 0 until 4) {
                val nx = x + directions[i]
                val ny = y + directions[i + 1]
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true
                    pq.offer(intArrayOf(nx, ny, max(elevation, grid[nx][ny])))
                }
            }
        }
        return -1
    }
}

