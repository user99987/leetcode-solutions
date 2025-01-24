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
 * Input: s = “aa”, p = “a”
 * <p>
 * Output: false
 * <p>
 * Explanation: “a” does not match the entire string “aa”.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “aa”, p = “*”
 * <p>
 * Output: true
 * <p>
 * Explanation: '*' matches any sequence.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “cb”, p = “?a”
 * <p>
 * Output: false
 * <p>
 * Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 * <p>
 * Example 4:
 * <p>
 * Input: s = “adceb”, p = “*a*b”
 * <p>
 * Output: true
 * <p>
 * Explanation: The first '*' matches the empty sequence, while the second '*' matches the substring “dce”.
 * <p>
 * Example 5:
 * <p>
 * Input: s = “acdcb”, p = “a*c?b”
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

    public boolean isMatch(String inputString, String pattern) {
        int i = 0;
        int j = 0;
        int starIdx = -1;
        int lastMatch = -1;
        while (i < inputString.length()) {
            if (j < pattern.length()
                    && (inputString.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?')) {
                i++;
                j++;
            } else if (j < pattern.length() && pattern.charAt(j) == '*') {
                starIdx = j;
                lastMatch = i;
                j++;
            } else if (starIdx != -1) {
                // there is a no match and there was a previous star, we will reset the j to indx
                // after star_index
                // lastMatch will tell from which index we start comparing the string if we
                // encounter * in pattern
                j = starIdx + 1;
                // we are saying we included more characters in * so we incremented the
                lastMatch++;
                // index
                i = lastMatch;
            } else {
                return false;
            }
        }
        boolean isMatch = true;
        while (j < pattern.length() && pattern.charAt(j) == '*') {
            j++;
        }
        if (i != inputString.length() || j != pattern.length()) {
            isMatch = false;
        }
        return isMatch;
    }

}
