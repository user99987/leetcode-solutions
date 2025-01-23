package popular;

/**
 * Easy
 * <p>
 * Given a non-negative integer x, compute and return the square root of x.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 * <p>
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 4
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: x = 8
 * <p>
 * Output: 2
 * <p>
 * Explanation: The square root of 8 is 2.82842…, and since the decimal part is truncated, 2 is returned.
 * <p>
 * Constraints:
 * <p>
 * 0 <= x <= 2^31 - 1
 */
public class SqrtX {

    public int mySqrt(int x) {
        int s = 0, e = x;
        long ans = 0L;
        while (s <= e) {
            long m = s + (e - s) / 2;
            long prod = m * m;
            if (prod <= x) {
                s = (int) (m + 1);
                ans = m;
            } else e = (int) m - 1;
        }
        return (int) ans;
    }
}
