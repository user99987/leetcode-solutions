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

    public static void main(String[] args) throws Exception {
        System.out.println(new MonotoneIncreasingDigits().monotoneIncreasingDigits(10));
    }

    public int monotoneIncreasingDigits(int n) {
        for (int i = 10; n / i > 0; i *= 10) {
            int digit = (n / i) % 10;
            int endnum = n % i;
            int firstendnum = endnum * 10 / i;
            if (digit > firstendnum) {
                n -= endnum + 1;
            }
        }
        return n;
    }

}
