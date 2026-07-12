package backtracking;

/**
 * Medium
 * <p>
 * You are given an integer array nums and an integer target.
 * <p>
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
 * <p>
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
 * Return the number of different expressions that you can build, which evaluates to target.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1,1,1], target = 3
 * <p>
 * Output: 5
 * <p>
 * Explanation:
 * <p>
 * There are 5 ways to assign symbols to make the sum of nums be target 3.
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 * Example 2:
 * <p>
 * Input: nums = [1], target = 1
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 20
 * 0 <= nums[i] <= 1000
 * 0 <= sum(nums[i]) <= 1000
 * -1000 <= target <= 1000
 */
public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > sum || ((sum + target) & 1) == 1) {
            return 0;
        }

        int subsetSum = (sum + target) / 2;
        var ways = new int[subsetSum + 1];
        ways[0] = 1;

        for (int num : nums) {
            for (int current = subsetSum; current >= num; current--) {
                ways[current] += ways[current - num];
            }
        }
        return ways[subsetSum];
    }
}
