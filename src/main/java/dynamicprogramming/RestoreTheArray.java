package dynamicprogramming;

/**
 * Hard
 * <p>
 * A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits s and all we know is that all integers in the array were in the range [1, k] and there are no leading zeros in the array.
 * <p>
 * Given the string s and the integer k, return the number of the possible arrays that can be printed as s using the mentioned program. Since the answer may be very large, return it modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "1000", k = 10000
 * <p>
 * Output: 1
 * <p>
 * Explanation: The only possible array is [1000]
 * <p>
 * Example 2:
 * <p>
 * Input: s = "1000", k = 10
 * <p>
 * Output: 0
 * <p>
 * Explanation: There cannot be an array that was printed this way and has all integer >= 1 and <= 10.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "1317", k = 2000
 * <p>
 * Output: 8
 * <p>
 * Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s consists of only digits and does not contain leading zeros.
 * 1 <= k <= 10^9
 */
public class RestoreTheArray {

    private static final int MOD = 1_000_000_007;

    public int numberOfArrays(String s, int k) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            long num = 0;
            for (int j = i; j < n; j++) {
                num = num * 10 + (s.charAt(j) - '0');
                if (num > k) {
                    break;
                }
                dp[i] = (dp[i] + dp[j + 1]) % MOD;
            }
        }
        return dp[0];
    }
}
