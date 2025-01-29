package binarysearch;

import java.util.PriorityQueue;

/**
 * Hard
 * <p>
 * You are given an n x n integer matrix grid where each value grid[i][j] represents the elevation at that point (i, j).
 * <p>
 * The rain starts to fall. At time t, the depth of the water everywhere is t. You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most t. You can swim infinite distances in zero time. Of course, you must stay within the boundaries of the grid during your swim.
 * <p>
 * Return the least time until you can reach the bottom right square (n - 1, n - 1) if you start at the top left square (0, 0).
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [[0,2],[1,3]]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * At time 0, you are in grid location (0, 0).
 * You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
 * You cannot reach point (1, 1) until time 3.
 * When the depth of water is 3, we can swim anywhere inside the grid.
 * Example 2:
 * <p>
 * Input: grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
 * <p>
 * Output: 16
 * <p>
 * Explanation:
 * <p>
 * The final route is shown.
 * We need to wait until time 16 so that (0, 0) and (4, 4) are connected.
 * Constraints:
 * <p>
 * n == grid.length
 * n == grid[i].length
 * 1 <= n <= 50
 * 0 <= grid[i][j] < n2
 * Each value grid[i][j] is unique.
 */
public class SwimInRisingWater {

    private final int[] directions = {-1, 0, 1, 0, -1};

    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        boolean[][] visited = new boolean[n][n];

        pq.offer(new int[]{0, 0, grid[0][0]});
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int x = cell[0], y = cell[1], elevation = cell[2];

            if (x == n - 1 && y == n - 1) return elevation;

            for (int i = 0; i < 4; i++) {
                int nx = x + directions[i], ny = y + directions[i + 1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    pq.offer(new int[]{nx, ny, Math.max(elevation, grid[nx][ny])});
                }
            }
        }
        return -1;
    }
}
