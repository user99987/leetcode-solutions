package popular;

import java.util.ArrayList;

/**
 * Medium
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * <p>
 * Output: true
 * <p>
 * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0. So it is possible.
 * <p>
 * Example 2:
 * <p>
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * <p>
 * Output: false
 * <p>
 * Explanation: There are a total of 2 courses to take. To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 * <p>
 * Constraints:
 * <p>
 * 1 <= numCourses <= 10^5
 * 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * All the pairs prerequisites[i] are unique.
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        var adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            adj[pre[1]].add(pre[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inRecStack = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && hasCycle(adj, i, visited, inRecStack)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(ArrayList<Integer>[] adj, int node, boolean[] visited, boolean[] inRecStack) {
        visited[node] = true;
        inRecStack[node] = true;
        for (int nei : adj[node]) {
            if (!visited[nei] && hasCycle(adj, nei, visited, inRecStack)) {
                return true;
            }
            if (inRecStack[nei]) {
                return true;
            }
        }
        inRecStack[node] = false;
        return false;
    }
}
