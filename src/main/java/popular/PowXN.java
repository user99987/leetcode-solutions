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
        if (n == 0) return 1D;
        // use long to avoid overflow.
        return solve(n < 0 ? (1 / x) : x, (long) n < 0 ? ((long) n * -1) : (long) n);
    }

    public double solve(double x, long n) {
        if (n == 1) return x;
        double val = solve(x, n / 2);
        return val * val * ((n % 2) == 0 ? 1 : x);
    }
}
