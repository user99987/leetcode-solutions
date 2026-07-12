package popular;

/**
 * Medium
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "babad"
 * <p>
 * Output: "bab" Note: "aba" is also a valid answer.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "cbbd"
 * <p>
 * Output: "bb"
 * <p>
 * Example 3:
 * <p>
 * Input: s = "a"
 * <p>
 * Output: "a"
 * <p>
 * Example 4:
 * <p>
 * Input: s = "ac"
 * <p>
 * Output: "a"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int bestStart = 0;
        int bestLength = 1;

        for (int center = 0; center < s.length(); center++) {
            int oddLength = expandAroundCenter(s, center, center);
            if (oddLength > bestLength) {
                bestLength = oddLength;
                bestStart = center - oddLength / 2;
            }

            int evenLength = expandAroundCenter(s, center, center + 1);
            if (evenLength > bestLength) {
                bestLength = evenLength;
                bestStart = center - evenLength / 2 + 1;
            }
        }
        return s.substring(bestStart, bestStart + bestLength);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
