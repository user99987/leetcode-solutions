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
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int sum = totalSum - target;
        if (sum < 0 || sum % 2 == 1) {
            return 0;
        }
        return solve(nums, sum / 2);
    }

    private int solve(int[] nums, int target) {
        int[] prev = new int[target + 1];
        if (nums[0] == 0) {
            prev[0] = 2;
        } else {
            prev[0] = 1;
        }
        if (nums[0] != 0 && nums[0] <= target) {
            prev[nums[0]] = 1;
        }
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int[] curr = new int[target + 1];
            for (int j = 0; j <= target; j++) {
                int taken = 0;
                if (j >= nums[i]) {
                    taken = prev[j - nums[i]];
                }
                int nonTaken = prev[j];
                curr[j] = taken + nonTaken;
            }
            prev = curr;
        }
        return prev[target];
    }
}
