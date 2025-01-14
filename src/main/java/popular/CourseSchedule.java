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
 * 1 <= numCourses <= 105
 * 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * All the pairs prerequisites[i] are unique.
 */
public class CourseSchedule {

    private static final int WHITE = 0;
    private static final int GRAY = 1;
    private static final int BLACK = 2;

    public static void main(String[] args) throws Exception {
        int[][] pre = {{1, 0}};
        System.out.println(new CourseSchedule().canFinish(2, pre));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] pre : prerequisites) {
            adj[pre[1]].add(pre[0]);
        }
        int[] colors = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (colors[i] == WHITE && !adj[i].isEmpty() && hasCycle(adj, i, colors)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(ArrayList<Integer>[] adj, int node, int[] colors) {
        colors[node] = GRAY;
        for (int nei : adj[node]) {
            if (colors[nei] == GRAY) {
                return true;
            }
            if (colors[nei] == WHITE && hasCycle(adj, nei, colors)) {
                return true;
            }
        }
        colors[node] = BLACK;
        return false;
    }
}
