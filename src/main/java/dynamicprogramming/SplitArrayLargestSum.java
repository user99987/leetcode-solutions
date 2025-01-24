package dynamicprogramming;

/**
 * Hard
 * <p>
 * Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
 * <p>
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [7,2,5,10,8], m = 2
 * <p>
 * Output: 18
 * <p>
 * Explanation:
 * <p>
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,5], m = 2
 * <p>
 * Output: 9
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,4,4], m = 3
 * <p>
 * Output: 4
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 10^6
 * 1 <= m <= min(50, nums.length)
 */
public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        int[][] dp = new int[m][nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (j + 1 >= nums.length) break;
                for (int k = 0; k < m - 1; k++) {
                    dp[k + 1][i] = (dp[k + 1][i] == 0) ? Integer.MAX_VALUE : dp[k + 1][i];
                    int temp = Math.max(sum, dp[k][j + 1]);
                    dp[k + 1][i] = Math.min(dp[k + 1][i], temp);
                }
            }
            dp[0][i] = sum;
        }
        return dp[m - 1][0];
    }
}
