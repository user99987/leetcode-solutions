package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * Given two integer arrays arr1 and arr2, return the minimum number of operations (possibly zero) needed to make arr1 strictly increasing.
 * <p>
 * In one operation, you can choose two indices 0 <= i < arr1.length and 0 <= j < arr2.length and do the assignment arr1[i] = arr2[j].
 * <p>
 * If there is no way to make arr1 strictly increasing, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
 * <p>
 * Output: 1
 * <p>
 * Explanation: Replace 5 with 2, then arr1 = [1, 2, 3, 6, 7].
 * <p>
 * Example 2:
 * <p>
 * Input: arr1 = [1,5,3,6,7], arr2 = [4,3,1]
 * <p>
 * Output: 2
 * <p>
 * Explanation: Replace 5 with 3 and then replace 3 with 4. arr1 = [1, 3, 4, 6, 7].
 * <p>
 * Example 3:
 * <p>
 * Input: arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
 * <p>
 * Output: -1
 * <p>
 * Explanation: You can't make arr1 strictly increasing.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr1.length, arr2.length <= 2000
 * 0 <= arr1[i], arr2[i] <= 10^9
 */
public class MakeArrayStrictlyIncreasing {

    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        int start = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != arr2[start]) {
                arr2[++start] = arr2[i];
            }
        }
        int[] dp = new int[start + 3];
        for (int i = 0; i < arr1.length; i++) {
            int noChange = dp[dp.length - 1];
            if (i > 0 && (arr1[i - 1] >= arr1[i])) {
                noChange = -1;
            }
            for (int j = dp.length - 2; j > 0; j--) {
                if (arr2[j - 1] < arr1[i] && dp[j] != -1) {
                    noChange = noChange == -1 ? dp[j] : Math.min(noChange, dp[j]);
                }
                if (dp[j - 1] != -1) {
                    dp[j] = 1 + dp[j - 1];
                } else {
                    dp[j] = -1;
                }
                if (i > 0 && arr1[i - 1] < arr2[j - 1] && dp[dp.length - 1] >= 0) {
                    dp[j] =
                            dp[j] == -1
                                    ? (dp[dp.length - 1] + 1)
                                    : Math.min(dp[j], dp[dp.length - 1] + 1);
                }
            }
            dp[0] = -1;
            dp[dp.length - 1] = noChange;
        }
        int result = -1;
        for (int num : dp) {
            if (num != -1) {
                result = result == -1 ? num : Math.min(result, num);
            }
        }
        return result;
    }
}
