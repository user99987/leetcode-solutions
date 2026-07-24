package popular

/**
 * Hard
 *
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 *
 * Example 1:
 *
 * Input: s = "aa", p = "a"
 *
 * Output: false
 *
 * Explanation: "a" does not match the entire string "aa".
 *
 * Example 2:
 *
 * Input: s = "aa", p = "*"
 *
 * Output: true
 *
 * Explanation: '*' matches any sequence.
 *
 * Example 3:
 *
 * Input: s = "cb", p = "?a"
 *
 * Output: false
 *
 * Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 *
 * Example 4:
 *
 * Input: s = "adceb", p = "*a*b"
 *
 * Output: true
 *
 * Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
 *
 * Example 5:
 *
 * Input: s = "acdcb", p = "a*c?b"
 *
 * Output: false
 *
 * Constraints:
 *
 * 0 <= s.length, p.length <= 2000
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '?' or '*'.
 */
class WildcardMatchingK {

    fun isMatch(input: String, pattern: String): Boolean {
        var i = 0
        var j = 0
        var starIndex = -1
        var lastMatch = -1

        while (i < input.length) {
            if (j < pattern.length && (input[i] == pattern[j] || pattern[j] == '?')) {
                i++
                j++
            } else if (j < pattern.length && pattern[j] == '*') {
                starIndex = j++
                lastMatch = i
            } else if (starIndex != -1) {
                j = starIndex + 1
                lastMatch++
                i = lastMatch
            } else {
                return false
            }
        }

        return j == pattern.length || pattern.substring(j).all { it == '*' }
    }
}

