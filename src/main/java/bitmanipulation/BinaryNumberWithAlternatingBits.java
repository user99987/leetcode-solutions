package bitmanipulation;

/**
 * Easy
 * <p>
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5
 * <p>
 * Output: true
 * <p>
 * Explanation: The binary representation of 5 is: 101
 * <p>
 * Example 2:
 * <p>
 * Input: n = 7
 * <p>
 * Output: false
 * <p>
 * Explanation: The binary representation of 7 is: 111.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 11
 * <p>
 * Output: false
 * <p>
 * Explanation: The binary representation of 11 is: 1011.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 2^31 - 1
 */
public class BinaryNumberWithAlternatingBits {

    public static void main(String[] args) {
        System.out.println(new BinaryNumberWithAlternatingBits().hasAlternatingBits(18));
    }

    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        while (n != 0) {
            int v = n & 1;
            n = n >> 1;
            if (prev == v) {
                return false;
            }
            prev = v;
        }
        return true;
    }
}
