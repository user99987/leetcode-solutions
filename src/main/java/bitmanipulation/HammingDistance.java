package bitmanipulation;

/**
 * Easy
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given two integers x and y, return the Hamming distance between them.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation: 1 (0 0 0 1) 4 (0 1 0 0) ↑ ↑ The above arrows point to positions where the corresponding bits are different.
 * <p>
 * Example 2:
 * <p>
 * Input: x = 3, y = 1
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 0 <= x, y <= 2^31 - 1
 */
public class HammingDistance {

    public static void main(String[] args) throws Exception {
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
