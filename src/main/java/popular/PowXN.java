package popular;

/**
 * Medium
 * <p>
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * <p>
 * Example 1:
 * <p>
 * Input: x = 2.00000, n = 10
 * <p>
 * Output: 1024.00000
 * <p>
 * Example 2:
 * <p>
 * Input: x = 2.10000, n = 3
 * <p>
 * Output: 9.26100
 * <p>
 * Example 3:
 * <p>
 * Input: x = 2.00000, n = -2
 * <p>
 * Output: 0.25000
 * <p>
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25
 * <p>
 * Constraints:
 * <p>
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * -104 <= xn <= 104
 */
public class PowXN {

    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        double result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= x;
            }
            x *= x;
            exp >>= 1;
        }
        return result;
    }
}
