package dynamicprogramming;

/**
 * Medium
 * <p>
 * You are given an integer n. You have an n x n binary grid grid with all values initially 1's except for some indices given in the array mines. The ith element of the array mines is defined as mines[i] = [xi, yi] where grid[xi][yi] == 0.
 * <p>
 * Return the order of the largest axis-aligned plus sign of 1's contained in grid. If there is none, return 0.
 * <p>
 * An axis-aligned plus sign of 1's of order k has some center grid[r][c] == 1 along with four arms of length k - 1 going up, down, left, and right, and made of 1's. Note that there could be 0's or 1's beyond the arms of the plus sign, only the relevant area of the plus sign is checked for 1's.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: n = 5, mines = [[4,2]]
 * <p>
 * Output: 2
 * <p>
 * Explanation: In the above grid, the largest plus sign can only be of order 2. One of them is shown.
 * <p>
 * Example 2:
 * <p>
 * <p>
 * <p>
 * Input: n = 1, mines = [[0,0]]
 * <p>
 * Output: 0
 * <p>
 * Explanation: There is no plus sign, so return 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 500
 * 1 <= mines.length <= 5000
 * 0 <= xi, yi < n
 * All the pairs (xi, yi) are unique.
 */
public class LargestPlusSign {

    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] dp = new int[n][n];
        for (var row = 0; row < n; row++) {
            for (var col = 0; col < n; col++) {
                dp[row][col] = n;
            }
        }
        for (var pos : mines) {
            dp[pos[0]][pos[1]] = 0;
        }

        for (var i = 0; i < n; i++) {
            int count = 0;
            for (var j = 0; j < n; j++) {
                count = dp[i][j] == 0 ? 0 : count + 1;
                dp[i][j] = Math.min(dp[i][j], count);
            }
            count = 0;
            for (var j = n - 1; j >= 0; j--) {
                count = dp[i][j] == 0 ? 0 : count + 1;
                dp[i][j] = Math.min(dp[i][j], count);
            }
        }

        int ans = 0;
        for (var j = 0; j < n; j++) {
            int count = 0;
            for (var i = 0; i < n; i++) {
                count = dp[i][j] == 0 ? 0 : count + 1;
                dp[i][j] = Math.min(dp[i][j], count);
            }
            count = 0;
            for (var i = n - 1; i >= 0; i--) {
                count = dp[i][j] == 0 ? 0 : count + 1;
                dp[i][j] = Math.min(dp[i][j], count);
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }
}
