package string;

/**
 * Easy
 * <p>
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * <p>
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * <p>
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * Example 1:
 * <p>
 * Input: s = "abcde", goal = "cdeab"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abcde", goal = "abced"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, goal.length <= 100
 * s and goal consist of lowercase English letters.
 */
public class RotateString {

    public boolean rotateString(String a, String b) {
        return a.length() == b.length() && (a + a).contains(b);
    }
}
