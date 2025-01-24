package popular;

/**
 * Medium
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * <p>
 * Output: true
 * <p>
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,1,0,4]
 * <p>
 * Output: false
 * <p>
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * 0 <= nums[i] <= 10^5
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
