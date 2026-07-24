package popular

/**
 * Easy
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([)]"
 *
 * Output: false
 *
 * Example 5:
 *
 * Input: s = "{[]}"
 *
 * Output: true
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
class ValidParenthesesK {

    companion object {
        private val BRACKETS = mapOf(')' to '(', '}' to '{', ']' to '[')
    }

    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (c in s) {
            if (BRACKETS.containsValue(c)) {
                stack.addFirst(c)
            } else if (stack.isEmpty() || stack.removeFirst() != BRACKETS[c]) {
                return false
            }
        }

        return stack.isEmpty()
    }
}

