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
 * s and goal consist of lowercase English letters.28/03
 */
public class RotateString {

    public static void main(String[] args) {
        System.out.println(new RotateString().rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String A, String B) {
        if (A.length() == 1 || A.isEmpty() || B.length() == 1 || B.isEmpty()) {
            return A.equals(B);
        } else if (A.length() != B.length()) {
            return false;
        }
        for (int i = 0, l = A.length(); i < l; i++) {
            char s = A.charAt(0);
            A = A.substring(1) + s;
            if (A.equals(B)) return true;
        }
        return false;
    }
}
