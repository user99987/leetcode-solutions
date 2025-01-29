package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * Given an array of digits, return the largest multiple of three that can be formed by concatenating some of the given digits in any order. If there is no answer return an empty string.
 * <p>
 * Since the answer may not fit in an integer data type, return the answer as a string. Note that the returning answer must not contain unnecessary leading zeros.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [8,1,9]
 * <p>
 * Output: "981"
 * <p>
 * Example 2:
 * <p>
 * Input: digits = [8,6,7,1,0]
 * <p>
 * Output: "8760"
 * <p>
 * Example 3:
 * <p>
 * Input: digits = [1]
 * <p>
 * Output: ""
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 104
 * 0 <= digits[i] <= 9
 */
public class LargestMultipleOfThree {

    public String largestMultipleOfThree(int[] digits) {
        int sum = 0;
        int[] count = new int[10];
        for (int x : digits) {
            sum += x;
            count[x]++;
        }
        StringBuilder sb = new StringBuilder();
        int[] copied = Arrays.copyOf(count, count.length);

        if (sum % 3 != 0) {
            int rem = sum % 3;
            int oldRem = rem;
            while (oldRem != 0) {
                while (rem != 0) {
                    copied[rem % 10]--;
                    if (copied[rem % 10] < 0) {
                        oldRem += 3;
                        rem = oldRem;
                        copied = Arrays.copyOf(count, count.length);
                        break;
                    }
                    rem /= 10;
                    if (rem == 0) oldRem = 0;
                }
            }
        }
        for (int i = 9; i >= 0; i--) {
            while (copied[i]-- > 0) {
                sb.append(i);
            }
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
