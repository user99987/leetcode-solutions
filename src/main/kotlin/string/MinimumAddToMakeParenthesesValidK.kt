package string

/**
 * Medium
 *
 * Return the minimum number of moves required to make a parentheses string s valid.
 */
class MinimumAddToMakeParenthesesValidK {

    fun minAddToMakeValid(s: String): Int {
        var open = 0
        var close = 0
        for (c in s) {
            if (c == '(') {
                open++
            } else if (open > 0) {
                open--
            } else {
                close++
            }
        }
        return open + close
    }
}

