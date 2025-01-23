package popular;

/**
 * Easy
 * <p>
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer’s internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2’s complement notation. Therefore, in Example 2 above, the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 * Example 1:
 * <p>
 * Input: n = 00000010100101000001111010011100
 * <p>
 * Output: 964176192 (00111001011110000010100101000000)
 * <p>
 * Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 11111111111111111111111111111101
 * <p>
 * Output: 3221225471 (10111111111111111111111111111111)
 * <p>
 * Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
 * <p>
 * Constraints:
 * <p>
 * The input must be a binary string of length 32
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int ret = 0;
        // because there are 32 bits in total
        for (int i = 0; i < 32; i++) {
            ret = ret << 1;
            // If the bit is 1 we OR it with 1, ie add 1
            if ((n & 1) > 0) {
                ret = ret | 1;
            }
            n = n >>> 1;
        }
        return ret;
    }

}
