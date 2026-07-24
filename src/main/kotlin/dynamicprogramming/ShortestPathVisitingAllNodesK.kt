package dynamicprogramming

import java.util.ArrayDeque

/**
 * Hard
 *
 * You have an undirected, connected graph of n nodes labeled from 0 to n - 1. You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.
 *
 * Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.
 *
 * Example 1:
 *
 * Input: graph = [[1,2,3],[0],[0],[0]]
 *
 * Output: 4
 *
 * Explanation: One possible path is [1,0,2,0,3]
 *
 * Example 2:
 *
 * Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
 *
 * Output: 4
 *
 * Explanation: One possible path is [0,1,4,2,3]
 *
 * Constraints:
 *
 * n == graph.length
 * 1 <= n <= 12
 * 0 <= graph[i].length < n
 * graph[i] does not contain i.
 * If graph[a] contains b, then graph[b] contains a.
 * The input graph is always connected.
 */
class ShortestPathVisitingAllNodesK {

    fun shortestPathLength(graph: Array<IntArray>): Int {
        val n = graph.size
        val targetState = (1 shl n) - 1
        val queue = ArrayDeque<IntArray>()
        val visited = Array(n) { BooleanArray(targetState + 1) }

        for (i in 0 until n) {
            queue.offer(intArrayOf(i, 1 shl i))
            visited[i][1 shl i] = true
        }

        var steps = 0
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val curr = queue.poll()
                val node = curr[0]
                val state = curr[1]

                if (state == targetState) {
                    return steps
                }

                for (neighbor in graph[node]) {
                    val nextState = state or (1 shl neighbor)
                    if (!visited[neighbor][nextState]) {
                        visited[neighbor][nextState] = true
                        queue.offer(intArrayOf(neighbor, nextState))
                    }
                }
            }
            steps++
        }
        return -1
    }
}

