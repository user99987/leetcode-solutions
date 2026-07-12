package greedy;

/**
 * Medium
 * <p>
 * Given two integers a and b, return any string s such that:
 * <p>
 * s has length a + b and contains exactly a 'a' letters, and exactly b 'b' letters,
 * The substring 'aaa' does not occur in s, and
 * The substring 'bbb' does not occur in s.
 * Example 1:
 * <p>
 * Input: a = 1, b = 2
 * <p>
 * Output: "abb"
 * <p>
 * Explanation: "abb", "bab" and "bba" are all correct answers.
 * <p>
 * Example 2:
 * <p>
 * Input: a = 4, b = 1
 * <p>
 * Output: "aabaa"
 * <p>
 * Constraints:
 * <p>
 * 0 <= a, b <= 100
 * It is guaranteed such an s exists for the given a and b.
 */
public class StringWithout3A3B {

    public String strWithout3a3b(int a, int b) {
        var result = new StringBuilder();
        var first = a >= b ? 'a' : 'b';
        var second = first == 'a' ? 'b' : 'a';
        var firstCount = Math.max(a, b);
        var secondCount = Math.min(a, b);

        while (firstCount > 0 || secondCount > 0) {
            if (firstCount > secondCount) {
                result.append(first);
                firstCount--;
                if (firstCount > secondCount) {
                    result.append(first);
                    firstCount--;
                }
            }
            if (secondCount > 0) {
                result.append(second);
                secondCount--;
            }
        }
        return result.toString();
    }
}
