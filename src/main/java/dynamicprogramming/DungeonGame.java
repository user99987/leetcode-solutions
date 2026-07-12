package dynamicprogramming;

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
        int[] dp = new int[n + 1];

        for (var j = 0; j <= n; j++) {
            dp[j] = Integer.MAX_VALUE;
        }
        dp[n - 1] = 1;

        for (var i = m - 1; i >= 0; i--) {
            for (var j = n - 1; j >= 0; j--) {
                int minHP = Math.min(dp[j], dp[j + 1]) - dungeon[i][j];
                dp[j] = Math.max(1, minHP);
            }
        }
        return dp[0];
    }
}
