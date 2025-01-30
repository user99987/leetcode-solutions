package popular;

/**
 * Hard
 * <p>
 * Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
 * <p>
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * The matching should cover the entire input string (not partial).
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aa", p = "a"
 * <p>
 * Output: false
 * <p>
 * Explanation: "a" does not match the entire string "aa".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "aa", p = "*"
 * <p>
 * Output: true
 * <p>
 * Explanation: '*' matches any sequence.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "cb", p = "?a"
 * <p>
 * Output: false
 * <p>
 * Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 * <p>
 * Example 4:
 * <p>
 * Input: s = "adceb", p = "*a*b"
 * <p>
 * Output: true
 * <p>
 * Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring "dce".
 * <p>
 * Example 5:
 * <p>
 * Input: s = "acdcb", p = "a*c?b"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length, p.length <= 2000
 * s contains only lowercase English letters.
 * p contains only lowercase English letters, '?' or '*'.
 */
public class WildcardMatching {

    public boolean isMatch(String input, String pattern) {
        int i = 0, j = 0, starIndex = -1, lastMatch = -1;

        while (i < input.length()) {
            if (j < pattern.length() && (input.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < pattern.length() && pattern.charAt(j) == '*') {
                starIndex = j++;
                lastMatch = i;
            } else if (starIndex != -1) {
                j = starIndex + 1;
                i = ++lastMatch;
            } else {
                return false;
            }
        }

        return j == pattern.length() || pattern.substring(j).chars().allMatch(ch -> ch == '*');
    }

}
