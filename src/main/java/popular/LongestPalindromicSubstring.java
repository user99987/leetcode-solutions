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
        int n = s.length();

        // All substrings of length 1 are palindromes
        int maxLen = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                // Check if the current substring is
                // a palindrome
                if (checkPal(s, i, j) && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(start, start + maxLen);
    }

    private boolean checkPal(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

}
