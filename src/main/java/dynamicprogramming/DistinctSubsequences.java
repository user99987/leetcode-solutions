package dynamicprogramming;

/**
 * Hard
 * <p>
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * <p>
 * A string's subsequence is a new string formed from the original string by deleting some (can be none) of the characters
 * without disturbing the remaining characters' relative positions.
 * <p>
 * Example 1:
 * Input: s = "rabbbit", t = "rabbit"
 * Output: 3
 * <p>
 * Example 2:
 * Input: s = "babgbag", t = "bag"
 * Output: 5
 */
public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        int tLength = t.length();
        long[] dp = new long[tLength + 1];
        dp[0] = 1;

        for (var i = 0; i < s.length(); i++) {
            for (var j = tLength - 1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[j + 1] += dp[j];
                }
            }
        }
        return (int) dp[tLength];
    }
}
