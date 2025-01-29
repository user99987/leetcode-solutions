package array;

/**
 * Medium
 * <p>
 * You are given an integer num. You can swap two digits at most once to get the maximum valued number.
 * <p>
 * Return the maximum valued number you can get.
 * <p>
 * Example 1:
 * <p>
 * Input: num = 2736
 * <p>
 * Output: 7236
 * <p>
 * Explanation: Swap the number 2 and the number 7.
 * <p>
 * Example 2:
 * <p>
 * Input: num = 9973
 * <p>
 * Output: 9973
 * <p>
 * Explanation: No swap.
 * <p>
 * Constraints:
 * <p>
 * 0 <= num <= 10^8
 */
public class MaximumSwap {

    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            int maxIndex = i;
            for (int j = digits.length - 1; j > i; j--) {
                if (digits[j] > digits[maxIndex]) maxIndex = j;
            }

            if (maxIndex != i) {
                char temp = digits[i];
                digits[i] = digits[maxIndex];
                digits[maxIndex] = temp;
                return Integer.parseInt(new String(digits));
            }
        }

        return num;
    }
}
