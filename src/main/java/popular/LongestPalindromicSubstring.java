package popular;

/**
 * Medium
 * <p>
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “babad”
 * <p>
 * Output: “bab” Note: “aba” is also a valid answer.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “cbbd”
 * <p>
 * Output: “bb”
 * <p>
 * Example 3:
 * <p>
 * Input: s = “a”
 * <p>
 * Output: “a”
 * <p>
 * Example 4:
 * <p>
 * Input: s = “ac”
 * <p>
 * Output: “a”
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}
