package dynamicprogramming;

/**
 * Hard
 * <p>
 * You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.
 * <p>
 * If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
 * <p>
 * Return the maximum coins you can collect by bursting the balloons wisely.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,1,5,8]
 * <p>
 * Output: 167
 * <p>
 * Explanation:
 * <p>
 * nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
 * coins = 3*1*5 + 3*5*8 + 1*3*8 + 1*8*1 = 167
 * Example 2:
 * <p>
 * Input: nums = [1,5]
 * <p>
 * Output: 10
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 500
 * 0 <= nums[i] <= 100
 */
public class BurstBalloons {

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];

        for (int gap = 0; gap < n; gap++) {
            for (int left = 0, right = gap; right < n; left++, right++) {
                int maxCoins = 0;
                int leftVal = (left == 0) ? 1 : nums[left - 1];
                int rightVal = (right == n - 1) ? 1 : nums[right + 1];

                for (int i = left; i <= right; i++) {
                    int coins = (i == left ? 0 : dp[left][i - 1])
                            + leftVal * nums[i] * rightVal
                            + (i == right ? 0 : dp[i + 1][right]);
                    maxCoins = Math.max(maxCoins, coins);
                }
                dp[left][right] = maxCoins;
            }
        }
        return dp[0][n - 1];
    }
}
