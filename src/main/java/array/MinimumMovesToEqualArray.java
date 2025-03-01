package array;

/**
 * Medium
 * <p>
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 * <p>
 * In one move, you can increment n - 1 elements of the array by 1.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * <p>
 * Output: 3
 * <p>
 * Explanation: Only three moves are needed (remember each move increments two elements): [1,2,3] => [2,3,3] => [3,4,3] => [4,4,4]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,1,1]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * The answer is guaranteed to fit in a 32-bit integer.
 */
public class MinimumMovesToEqualArray {

    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return sum - min * nums.length;
    }
}
