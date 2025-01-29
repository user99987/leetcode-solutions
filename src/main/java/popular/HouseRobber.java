package popular;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 * <p>
 * Input: nums = [2,7,9,3,1]
 * <p>
 * Output: 12
 * <p>
 * Explanation:
 * <p>
 * Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0];
        IntStream.range(1, nums.length)
                .forEach(i -> dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]));
        return dp[nums.length];
    }
}
