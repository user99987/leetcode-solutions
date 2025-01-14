package popular;

/**
 * Medium
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * <p>
 * Output: 321
 * <p>
 * Example 2:
 * <p>
 * Input: x = -123
 * <p>
 * Output: -321
 * <p>
 * Example 3:
 * <p>
 * Input: x = 120
 * <p>
 * Output: 21
 * <p>
 * Example 4:
 * <p>
 * Input: x = 0
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * -2^31 <= x <= 2^31 - 1
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Test cases
        int x1 = 123;
        System.out.println("Example 1 Output: " + solution.reverse(x1));

        int x2 = -123;
        System.out.println("Example 2 Output: " + solution.reverse(x2));

        int x3 = 120;
        System.out.println("Example 3 Output: " + solution.reverse(x3));

        int x4 = 0;
        System.out.println("Example 4 Output: " + solution.reverse(x4));
    }

    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }
}
