package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon.
 * Return the knight's minimum initial health so that he can rescue the princess.
 * <p>
 * Example 1:
 * Input: dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]
 * Output: 7
 */
public class DungeonGame {

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m + 1][n + 1];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[m][n - 1] = dp[m - 1][n] = 1;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int minHP = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];
                dp[i][j] = Math.max(1, minHP);
            }
        }
        return dp[0][0];
    }
}
