package backtracking

/**
 * Hard
 *
 * Given a string s that contains parentheses and letters, remove the minimum number of invalid
 * parentheses to make the input string valid, returning all possible results.
 */
class RemoveInvalidParenthesesK {

    fun removeInvalidParentheses(s: String?): List<String> {
        val result = ArrayList<String>()
        if (s == null) return result

        val visited = HashSet<String>()
        val queue = ArrayDeque<String>()
        queue.add(s)
        visited.add(s)
        var found = false

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (isValid(current)) {
                result.add(current)
                found = true
            }
            if (found) continue

            for (i in current.indices) {
                if (current[i] != '(' && current[i] != ')') continue
                val next = current.substring(0, i) + current.substring(i + 1)
                if (next !in visited) {
                    queue.add(next)
                    visited.add(next)
                }
            }
        }
        return result
    }

    private fun isValid(s: String): Boolean {
        var count = 0
        for (c in s) {
            if (c == '(') count++
            if (c == ')') count--
            if (count < 0) return false
        }
        return count == 0
    }
}

