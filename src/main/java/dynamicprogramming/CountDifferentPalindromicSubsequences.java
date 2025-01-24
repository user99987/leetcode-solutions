package dynamicprogramming;

/**
 * Hard
 * <p>
 * Given a string s, return the number of different non-empty palindromic subsequences in s. Since the answer may be very large, return it modulo 109 + 7.
 * <p>
 * A subsequence of a string is obtained by deleting zero or more characters from the string.
 * <p>
 * A sequence is palindromic if it is equal to the sequence reversed.
 * <p>
 * Two sequences a1, a2, ... and b1, b2, ... are different if there is some i for which ai != bi.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "bccb"
 * <p>
 * Output: 6
 * <p>
 * Explanation: The 6 different non-empty palindromic subsequences are 'b', 'c', 'bb', 'cc', 'bcb', 'bccb'. Note that 'bcb' is counted only once, even though it occurs twice.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"
 * <p>
 * Output: 104860361
 * <p>
 * Explanation: There are 3104860382 different non-empty palindromic subsequences, which is 104860361 modulo 109 + 7.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s[i] is either 'a', 'b', 'c', or 'd'.
 */
public class CountDifferentPalindromicSubsequences {

    public int countPalindromicSubsequences(String s) {
        int big = 1000000007;
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int deta = 1;
            dp[i][i] = 1;
            int l2 = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) == c) {
                    if (l2 < 0) {
                        l2 = j;
                        deta = dp[j + 1][i - 1] + 1;
                    } else {
                        deta = dp[j + 1][i - 1] - dp[j + 1][l2 - 1];
                    }
                    deta = deal(deta, big);
                }
                dp[j][i] = deal(dp[j][i - 1] + deta, big);
            }
        }
        return deal(dp[0][len - 1], big);
    }

    private int deal(int x, int big) {
        x %= big;
        if (x < 0) {
            x += big;
        }
        return x;
    }
}
