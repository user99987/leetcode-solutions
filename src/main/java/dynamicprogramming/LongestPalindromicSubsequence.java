package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given a string s, find the longest palindromic subsequence’s length in s.
 * <p>
 * A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “bbbab”
 * <p>
 * Output: 4
 * <p>
 * Explanation: One possible longest palindromic subsequence is “bbbb”.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “cbbd”
 * <p>
 * Output: 2
 * <p>
 * Explanation: One possible longest palindromic subsequence is “bb”.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consists only of lowercase English letters.
 */
public class LongestPalindromicSubsequence {

    public static void main(String[] args) throws Exception {
        System.out.println(new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }

    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        String sI = new StringBuilder(s).reverse().toString();
        for (int i = 1, l = s.length(); i <= l; i++)
            for (int j = 1; j <= l; j++) {
                dp[i][j] =
                        (s.charAt(i - 1) == sI.charAt(j - 1))
                                ? dp[i - 1][j - 1] + 1
                                : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }

        return dp[s.length()][s.length()];
    }
}
