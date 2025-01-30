package popular;


import java.util.stream.IntStream;

/**
 * Easy
 * <p>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * <p>
 * Output: [1,2,4]
 * <p>
 * Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
 * <p>
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * <p>
 * Output: [4,3,2,2]
 * <p>
 * Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2].
 * <p>
 * Example 3:
 * <p>
 * Input: digits = [0]
 * <p>
 * Output: [1]
 * <p>
 * Explanation: The array represents the integer 0. Incrementing by one gives 0 + 1 = 1. Thus, the result should be [1].
 * <p>
 * Example 4:
 * <p>
 * Input: digits = [9]
 * <p>
 * Output: [1,0]
 * <p>
 * Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should be [1,0].
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0 && carry > 0; i--) {
            digits[i] = (digits[i] + carry) % 10;
            carry = digits[i] == 0 ? 1 : 0;
        }
        return carry == 1 ? IntStream.concat(IntStream.of(1), IntStream.of(digits)).toArray() : digits;
    }
}
