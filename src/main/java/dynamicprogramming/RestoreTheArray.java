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

    public int numberOfArrays(String s, int k) {
        int kMod = 1000000007;
        int n = s.length();
        int[] dp = new int[n];
        if (s.charAt(n - 1) != '0') {
            dp[n - 1] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            }
            long temp = 0;
            int j = i;
            while (j < n && temp * 10 + s.charAt(j) - '0' <= k) {
                temp = temp * 10 + s.charAt(j) - '0';
                if (j == n - 1) {
                    dp[i] += 1;
                } else {
                    dp[i] += dp[j + 1];
                }
                dp[i] %= kMod;
                j++;
            }
        }
        return dp[0];
    }
}
