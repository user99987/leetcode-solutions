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
        String first = a > b ? "a" : "b";
        String second = first.equals("a") ? "b" : "a";
        int firstLen = Math.max(a, b);
        int secondLen = Math.min(a, b);
        StringBuilder ans = new StringBuilder();
        // Case 1 : A and B count are unequal.
        while (firstLen > 0 && secondLen > 0 && firstLen != secondLen) {
            ans.append(first);
            ans.append(first);
            firstLen = firstLen - 2;
            ans.append(second);
            secondLen--;
        }
        // Case 2: A and B count are equal
        while (firstLen > 0 && secondLen > 0) {
            ans.append(first);
            ans.append(second);
            firstLen--;
            secondLen--;
        }
        // left over, just append
        while (firstLen > 0) {
            ans.append(first);
            firstLen--;
        }
        return ans.toString();
    }
}
