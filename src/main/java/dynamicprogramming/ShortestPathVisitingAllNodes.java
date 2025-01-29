package dynamicprogramming;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Hard
 * <p>
 * You have an undirected, connected graph of n nodes labeled from 0 to n - 1. You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.
 * <p>
 * Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.
 * <p>
 * Example 1:
 * <p>
 * Input: graph = [[1,2,3],[0],[0],[0]]
 * <p>
 * Output: 4
 * <p>
 * Explanation: One possible path is [1,0,2,0,3]
 * <p>
 * Example 2:
 * <p>
 * Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
 * <p>
 * Output: 4
 * <p>
 * Explanation: One possible path is [0,1,4,2,3]
 * <p>
 * Constraints:
 * <p>
 * n == graph.length
 * 1 <= n <= 12
 * 0 <= graph[i].length < n
 * graph[i] does not contain i.
 * If graph[a] contains b, then graph[b] contains a.
 * The input graph is always connected.
 */
public class ShortestPathVisitingAllNodes {

    public int shortestPathLength(int[][] graph) {
        int n = graph.length, targetState = (1 << n) - 1;
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][targetState + 1];

        for (int i = 0; i < n; i++) {
            queue.offer(new int[]{i, 1 << i});
            visited[i][1 << i] = true;
        }

        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int node = curr[0], state = curr[1];

                if (state == targetState) {
                    return steps;
                }

                for (int neighbor : graph[node]) {
                    int nextState = state | (1 << neighbor);
                    if (!visited[neighbor][nextState]) {
                        visited[neighbor][nextState] = true;
                        queue.offer(new int[]{neighbor, nextState});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
