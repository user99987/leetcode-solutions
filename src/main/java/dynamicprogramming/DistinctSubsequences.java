package dynamicprogramming;

import java.util.Arrays;

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

    private int[][] dp;

    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return countWays(0, 0, s, t);
    }

    private int countWays(int i, int j, String s, String t) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        dp[i][j] = countWays(i + 1, j, s, t);
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] += countWays(i + 1, j + 1, s, t);
        }
        return dp[i][j];
    }
}
