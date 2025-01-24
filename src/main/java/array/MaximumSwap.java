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
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j = chars.length - 1;
            int indx = i;
            char c = chars[i];
            while (j > i) {
                if (chars[j] > c) {
                    c = chars[j];
                    indx = j;
                }
                j--;
            }
            if (indx != i) {
                char temp = chars[i];
                chars[i] = chars[indx];
                chars[indx] = temp;
                return Integer.parseInt(String.valueOf(chars));
            }
        }
        return num;
    }
}
