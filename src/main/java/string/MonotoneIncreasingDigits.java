package string;

/**
 * Medium
 * <p>
 * An integer has monotone increasing digits if and only if each pair of adjacent digits x and y satisfy x <= y.
 * <p>
 * Given an integer n, return the largest number that is less than or equal to n with monotone increasing digits.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 10
 * <p>
 * Output: 9
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1234
 * <p>
 * Output: 1234
 * <p>
 * Example 3:
 * <p>
 * Input: n = 332
 * <p>
 * Output: 299
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 10^9
 */
public class MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int marker = digits.length;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < digits[i - 1]) {
                digits[i - 1]--;
                marker = i;
            }
        }
        for (int i = marker; i < digits.length; i++) {
            digits[i] = '9';
        }
        return Integer.parseInt(new String(digits));
    }

}
