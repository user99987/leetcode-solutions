package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given a string s, return the number of palindromic substrings in it.
 * <p>
 * A string is a palindrome when it reads the same backward as forward.
 * <p>
 * A substring is a contiguous sequence of characters within the string.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc"
 * <p>
 * Output: 3
 * <p>
 * Explanation: Three palindromic strings: "a", "b", "c".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "aaa"
 * <p>
 * Output: 6
 * <p>
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            count += expandAroundCenter(chars, i, i);
            count += expandAroundCenter(chars, i, i + 1);
        }

        return count;
    }

    private int expandAroundCenter(char[] chars, int left, int right) {
        int count = 0;
        while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
