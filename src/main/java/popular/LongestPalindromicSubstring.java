package popular;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

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
        int n = s.length();
        AtomicInteger maxLength = new AtomicInteger(1);
        AtomicInteger start = new AtomicInteger();

        IntStream.range(0, n).forEach(i -> IntStream.range(i, n).forEach(j -> {
            if (checkPalindrome(s, i, j) && (j - i + 1) > maxLength.get()) {
                start.set(i);
                maxLength.set(j - i + 1);
            }
        }));
        return s.substring(start.get(), start.get() + maxLength.get());
    }

    private boolean checkPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

}
