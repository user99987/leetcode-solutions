package popular

/**
 * Medium
 * Course Schedule
 */
class CourseScheduleK {

    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val adj = Array(numCourses) { ArrayList<Int>() }
        for (pre in prerequisites) {
            adj[pre[1]].add(pre[0])
        }
        val visited = BooleanArray(numCourses)
        val inRecStack = BooleanArray(numCourses)
        for (i in 0 until numCourses) {
            if (!visited[i] && hasCycle(adj, i, visited, inRecStack)) {
                return false
            }
        }
        return true
    }

    private fun hasCycle(adj: Array<ArrayList<Int>>, node: Int, visited: BooleanArray, inRecStack: BooleanArray): Boolean {
        visited[node] = true
        inRecStack[node] = true
        for (nei in adj[node]) {
            if (!visited[nei] && hasCycle(adj, nei, visited, inRecStack)) {
                return true
            }
            if (inRecStack[nei]) {
                return true
            }
        }
        inRecStack[node] = false
        return false
    }
}

