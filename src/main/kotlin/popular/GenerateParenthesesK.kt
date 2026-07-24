package popular

/**
 * Medium
 * Generate Parentheses
 */
class GenerateParenthesesK {

    fun generateParenthesis(n: Int): List<String> {
        val result = ArrayList<String>()
        backtrack(StringBuilder(), 0, 0, n, result)
        return result
    }

    private fun backtrack(current: StringBuilder, open: Int, close: Int, n: Int, result: MutableList<String>) {
        if (current.length == 2 * n) {
            result.add(current.toString())
            return
        }
        if (open < n) {
            current.append("(")
            backtrack(current, open + 1, close, n, result)
            current.deleteCharAt(current.length - 1)
        }
        if (close < open) {
            current.append(")")
            backtrack(current, open, close + 1, n, result)
            current.deleteCharAt(current.length - 1)
        }
    }
}

