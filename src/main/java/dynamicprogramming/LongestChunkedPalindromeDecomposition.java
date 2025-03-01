package dynamicprogramming;

/**
 * Hard
 * <p>
 * You are given a string text. You should split it to k substrings (subtext1, subtext2, ..., subtextk) such that:
 * <p>
 * subtexti is a non-empty string.
 * The concatenation of all the substrings is equal to text (i.e., subtext1 + subtext2 + ... + subtextk == text).
 * subtexti == subtextk - i + 1 for all valid values of i (i.e., 1 <= i <= k).
 * Return the largest possible value of k.
 * <p>
 * Example 1:
 * <p>
 * Input: text = "ghiabcdefhelloadamhelloabcdefghi"
 * <p>
 * Output: 7
 * <p>
 * Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".
 * <p>
 * Example 2:
 * <p>
 * Input: text = "merchant"
 * <p>
 * Output: 1
 * <p>
 * Explanation: We can split the string on "(merchant)".
 * <p>
 * Example 3:
 * <p>
 * Input: text = "antaprezatepzapreanta"
 * <p>
 * Output: 11
 * <p>
 * Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)".
 * <p>
 * Constraints:
 * <p>
 * 1 <= text.length <= 1000
 * text consists only of lowercase English characters.
 */
public class LongestChunkedPalindromeDecomposition {
    private int[] dp;

    public int longestDecomposition(String text) {
        dp = new int[text.length()];
        return dp(0, text.length() - 1, text);
    }

    private int dp(int i, int e, String text) {
        if (i > e) return 0;
        if (i == e) return 1;
        if (dp[i] > 0) return dp[i];

        for (int j = e; j > i; j--) {
            if (text.charAt(j) == text.charAt(i)) {
                if (text.substring(j, e + 1).equals(text.substring(i, i + (e - j + 1)))) {
                    dp[i] = Math.max(dp[i], dp(i + (e - j + 1), j - 1, text) + 2);
                }
            }
        }
        return dp[i] = (dp[i] == 0) ? 1 : dp[i];
    }
}
