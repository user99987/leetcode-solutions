package popular;

/**
 * Hard
 * <p>
 * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * <p>
 * Example 1:
 * <p>
 * Input: s = “aa”, p = “a”
 * <p>
 * Output: false
 * <p>
 * Explanation: “a” does not match the entire string “aa”.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “aa”, p = “a*”
 * <p>
 * Output: true
 * <p>
 * Explanation: ‘*’ means zero or more of the preceding element, ‘a’. Therefore, by repeating ‘a’ once, it becomes “aa”.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “ab”, p = “.*”
 * <p>
 * Output: true
 * <p>
 * Explanation: “.*” means “zero or more (*) of any character (.)”.
 * <p>
 * Example 4:
 * <p>
 * Input: s = “aab”, p = “c*a*b”
 * <p>
 * Output: true
 * <p>
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches “aab”.
 * <p>
 * Example 5:
 * <p>
 * Input: s = “mississippi”, p = “mis*is*p*.”
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 20
 * 1 <= p.length <= 30
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '.', and '*'.
 * It is guaranteed for each appearance of the character '*', there will be a previous valid character to match.
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty())
            return s.isEmpty();

        boolean firstMatch = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');

        if (p.length() >= 2 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p));
        } else {
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }

}
