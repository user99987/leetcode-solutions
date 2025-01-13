package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 * <p>
 * A string’s subsequence is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters’ relative positions. (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * <p>
 * It is guaranteed the answer fits on a 32-bit signed integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “rabbbit”, t = “rabbit”
 * <p>
 * Output: 3
 * <p>
 * Explanation: As shown below, there are 3 ways you can generate “rabbit” from S. **rabb**b**it** **ra**b**bbit** **rab**b**bit**
 * <p>
 * Example 2:
 * <p>
 * Input: s = “babgbag”, t = “bag”
 * <p>
 * Output: 5
 * <p>
 * Explanation: As shown below, there are 5 ways you can generate “bag” from S. **ba**b**g**bag **ba**bgba**g** **b**abgb**ag** ba**b**gb**ag** babg**bag**
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, t.length <= 1000
 * s and t consist of English letters.
 */
public class DistinctSubsequences {
    int[][] DP;

    public static void main(String[] args) {
        System.out.println(new DistinctSubsequences().numDistinct("babgbag", "bag"));
    }

    public int numDistinct(String s, String t) {
        DP = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(DP[i], -1);
        }
        return dp(0, 0, s, t);
    }

    private int dp(int i, int j, String s, String t) {
        if (j >= t.length()) return 1;
        else if (i >= s.length()) return 0;
        else if (DP[i][j] != -1) return DP[i][j];
        else {
            if (s.charAt(i) != t.charAt(j)) {
                DP[i][j] = dp(i + 1, j, s, t);
            } else {
                DP[i][j] = dp(i + 1, j + 1, s, t) + dp(i + 1, j, s, t);
            }
            return DP[i][j];
        }
    }
}
