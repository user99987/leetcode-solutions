package popular;

/**
 * Medium
 * <p>
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * <p>
 * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 * <p>
 * Return the quotient after dividing dividend by divisor.
 * <p>
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [-231, 231 - 1]. For this problem, if the quotient is strictly greater than [231 - 1], then return [231 - 1], and if the quotient is strictly less than [-231 - 1], then return [-231 - 1].
 * <p>
 * Example 1:
 * <p>
 * Input: dividend = 10, divisor = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: 10/3 = 3.33333.. which is truncated to 3.
 * <p>
 * Example 2:
 * <p>
 * Input: dividend = 7, divisor = -3
 * <p>
 * Output: -2
 * <p>
 * Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 * <p>
 * Example 3:
 * <p>
 * Input: dividend = 0, divisor = 1
 * <p>
 * Output: 0
 * <p>
 * Example 4:
 * <p>
 * Input: dividend = 1, divisor = 1
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= dividend, divisor <= 2^31 - 1
 * divisor != 0
 * Solution
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        boolean isNegative = (dividend > 0) != (divisor > 0);
        long dividendAbs = Math.abs((long) dividend);
        long divisorAbs = Math.abs((long) divisor);
        long result = 0;

        while (dividendAbs >= divisorAbs) {
            long temp = divisorAbs, count = 1;
            while (dividendAbs >= (temp << 1)) {
                temp <<= 1;
                count <<= 1;
            }
            dividendAbs -= temp;
            result += count;
        }

        result = isNegative ? -result : result;
        return (int) Math.min(Math.max(result, Integer.MIN_VALUE), Integer.MAX_VALUE);
    }

}
