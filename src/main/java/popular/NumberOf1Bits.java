package popular;

/**
 * Easy
 * <p>
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
 * Example 1:
 * <p>
 * Input: n = 00000000000000000000000000001011
 * <p>
 * Output: 3
 * <p>
 * Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 00000000000000000000000010000000
 * <p>
 * Output: 1
 * <p>
 * Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
 * <p>
 * Example 3:
 * <p>
 * Input: n = 11111111111111111111111111111101
 * <p>
 * Output: 31
 * <p>
 * Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.
 * <p>
 * Constraints:
 * <p>
 * The input must be a binary string of length 32.
 */

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int sum = 0;
        boolean flag = false;
        if (n < 0) {
            flag = true;
            n = n - Integer.MIN_VALUE;
        }
        while (n > 0) {
            int k = n % 2;
            sum += k;
            n /= 2;
        }
        return flag ? sum + 1 : sum;
    }

}
